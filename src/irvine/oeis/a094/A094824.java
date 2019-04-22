package irvine.oeis.a094;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A094824 Maximum number of longest common substrings of two binary sequences of length n.
 * @author Sean A. Irvine
 */
public class A094824 implements Sequence {

  private int mN = 0;

  private int countLongestCommonSubsequence(final int n, final long a, final long b) {
    int bestLcs = 0;
    final HashSet<Long> bestPatterns = new HashSet<>();
    for (int shift = 0; shift < n && n - shift >= bestLcs; ++shift) {
      long d = b >>> shift;
      long c = a ^ d;
      // runs of 0 in c are common subsequences
      int current = 0;
      // s is number of bits remaining in c to examine
      long common = 0;
      for (int s = 0; s < n - shift; ++s, c >>>= 1, d >>>= 1) {
        if ((c & 1) == 1) {
          if (current >= bestLcs) {
            if (current > bestLcs) {
              bestPatterns.clear();
            }
            bestLcs = current;
            bestPatterns.add(common);
          }
          current = 0;
          common = 0;
        } else {
          ++current;
          common <<= 1;
          common |= d & 1;
        }
      }
      if (current >= bestLcs) {
        if (current > bestLcs) {
          bestPatterns.clear();
        }
        bestLcs = current;
        bestPatterns.add(common);
      }
    }

    // swap roles of a and b
    for (int shift = 0; shift < n && n - shift >= bestLcs; ++shift) {
      long d = a >>> shift;
      long c = b ^ d;
      // runs of 0 in c are common subsequences
      int current = 0;
      // s is number of bits remaining in c to examine
      long common = 0;
      for (int s = 0; s < n - shift; ++s, c >>>= 1, d >>>= 1) {
        if ((c & 1) == 1) {
          if (current >= bestLcs) {
            if (current > bestLcs) {
              bestPatterns.clear();
            }
            bestLcs = current;
            bestPatterns.add(common);
          }
          current = 0;
          common = 0;
        } else {
          ++current;
          common <<= 1;
          common |= d & 1;
        }
      }
      if (current >= bestLcs) {
        if (current > bestLcs) {
          bestPatterns.clear();
        }
        bestLcs = current;
        bestPatterns.add(common);
      }
    }
    //System.out.println(Long.toBinaryString(a) + " " + Long.toBinaryString(b) + " " + bestLcs + " " + bestPatterns);
    return bestPatterns.size();
  }

  @Override
  public Z next() {
    ++mN;
    int bestCount = 0;
    final long lim = 1L << mN;
    for (long a = 0; a < lim; ++a) {
      for (long b = a; b < lim; ++b) {
        final int c = countLongestCommonSubsequence(mN, a, b);
        if (c > bestCount) {
          //System.out.println(Long.toBinaryString(a) + " " + Long.toBinaryString(b) + " " + bestCount);
          bestCount = c;
        }
      }
    }
    return Z.valueOf(bestCount);
  }
}
