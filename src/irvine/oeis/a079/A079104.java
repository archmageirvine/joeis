package irvine.oeis.a079;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A079104 Number of permutations of length n containing the minimum number of monotone subsequences of length 4.
 * @author Joseph Samuel Myers (C)
 * @author Sean A. Irvine (Java port)
 */
public class A079104 extends Sequence1 {

  // Based on https://www.polyomino.org.uk/publications/2002/monotone-subseq.c
  // Direct support for specifying the region of permutations to run has been removed
  // If you want to compute new terms, you're better off using the C.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  // Original notice:

/* Copyright 2002 Joseph Samuel Myers.
   All rights reserved.
  
   Redistribution and use in source and binary forms,
   with or without modification, are permitted provided that
   the following conditions are met:
   1. Redistributions of source code must retain the above
      copyright notice, this list of conditions and the
      following disclaimer.
   2. Redistributions in binary form must reproduce the above
      copyright notice, this list of conditions and the
      following disclaimer in the documentation and/or
      other materials provided with the distribution.
   3. The name of the author may not be used to endorse
      or promote products derived from this software without
      specific prior written permission.
  
   THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND
   ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
   BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
   MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
   ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR BE LIABLE
   FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
   OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
   DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
   AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
   STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
   OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

  /* Compute the expected minimum number of monotone subsequences
     of length m in a permutation of length n.  */
  private static long expectedMinl(final int n, final int m) {
    final long segs = m - 1;
    final long sseg = n / segs;
    final long lseg = sseg + 1;
    final long lct = n % segs;
    final long sct = segs - lct;
    return sct * Binomial.binomial(sseg, m).longValueExact()
      + lct * Binomial.binomial(lseg, m).longValueExact();
  }

  /* Count of number of extremal subsequences found. */
  private long mCount = 0;

  /* Count of number of extremal subsequences found
     which have both ascending and descending subsequences
     of length m. */
  private long mSpecialCount = 0;

  /* Handle an extremal sequence. */
  private void handleExtremum(final int atotal, final int dtotal) {
    if (++mCount == 0) {
      throw new RuntimeException("count overflow");
    }
    if (atotal != 0 && dtotal != 0) {
      ++mSpecialCount;
    }
  }

  /**
   * Compute number of permutations of length <code>n</code> containing the
   * minimum number of monotone subsequences of length <code>m</code>.
   * @param n permutation length
   * @param m monotone length
   * @return count of permutations
   */
  protected Z t(final int n, final int m) {
    mCount = 0;
    // The permutation under test.
    final int[] perm = new int[n];
    // The numbers of ascending and descending subsequences
    // of lengths 1 to m ending at each position.
    final int[][] acounts = new int[n][m];
    final int[][] dcounts = new int[n][m];
    // next[0] is the least value not in the permutation.
    // next[1 + i] is the least value greater than i not
    // in the permutation up to and including the place, if
    // any, where i is in the permutation.
    final int[] next = IntegerUtils.identity(new int[n + 1]);
    // was[i] is the previous value that was in position i,
    // the value in that position having been increased at
    // least once while the previous values remained fixed,
    // or -1 if the value in position i is the first possible
    // value there given the previous values.
    final int[] was = new int[n];
    // The total number of ascending subsequences of length
    // m ending at or before each position.
    final int[] atotals = new int[n];
    // The total number descending subsequences of length
    // m ending at or before each position.
    final int[] dtotals = new int[n];
    // The expected minimum number of monotone subsequences
    // of length m, or the actually found minimum
    // if smaller.  */
    long minl = expectedMinl(n, m);
    Arrays.fill(perm, -1);
    // The current position within the permutation.
    int pos = 0;
    while (true) {
      // Fill in position pos.
      if (pos == n) {
        final int total = atotals[pos - 1] + dtotals[pos - 1];
        if (total <= minl) {
          if (total < minl) {
            mCount = 0;
            mSpecialCount = 0;
            minl = total;
            if (mVerbose) {
              StringUtils.message("Bettered expected result (" + minl + " instead of " + expectedMinl(n, m));
            }
          }
          handleExtremum(atotals[pos - 1], dtotals[pos - 1]);
        }
        --pos;
        continue;
      }
      final int j = perm[pos];
      final int nx = next[1 + j];
      if (j != -1) {
        next[1 + was[pos]] = j;
      }
      if (pos == 0 && nx >= n) {
        break;
      }
      if (nx == n) {
        perm[pos] = -1;
        --pos;
        continue;
      }
      perm[pos] = nx;
      was[pos] = j;
      next[1 + j] = next[1 + nx];
      acounts[pos][0] = 1;
      dcounts[pos][0] = 1;
      for (int k = 1; k < m; ++k) {
        int jacount = 0, jdcount = 0;
        // Compute numbers of (k+1)-sequences.
        for (int l = k - 1; l < pos; ++l) {
          if (perm[l] < perm[pos]) {
            jacount += acounts[l][k - 1];
          }
          if (perm[l] > perm[pos]) {
            jdcount += dcounts[l][k - 1];
          }
        }
        acounts[pos][k] = jacount;
        dcounts[pos][k] = jdcount;
      }
      atotals[pos] = (pos > 0 ? atotals[pos - 1] : 0) + acounts[pos][m - 1];
      dtotals[pos] = (pos > 0 ? dtotals[pos - 1] : 0) + dcounts[pos][m - 1];
      int addv = 0;
      final int total = atotals[pos] + dtotals[pos];
      if (pos < n - 1) {
        // Find the least and greatest values yet to be placed,
        // and see if either of them would force the number of
        // monotone subsequences to be too large,
        final int lv = next[0];
        int daddv = 0;
        for (int k = 0; k <= pos; ++k) {
          if (perm[k] > lv) {
            daddv += dcounts[k][m - 2];
          }
        }
        if (total + daddv > minl) {
          continue;
        }
        int gv = lv;
        while (next[1 + gv] != n) {
          gv = next[1 + gv];
        }
        for (int k = 0; k <= pos; ++k) {
          if (perm[k] < gv) {
            addv += acounts[k][m - 2];
          }
        }
      }
      if (total + addv <= minl) {
        ++pos;
      }
    }
    if (mVerbose) {
      StringUtils.message("Special count " + mSpecialCount);
    }
    return Z.valueOf(mCount);
  }

  @Override
  public Z next() {
    mCount = 0;
    return t(++mN, 4);
  }
}

