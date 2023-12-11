package irvine.oeis.a067;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067247 Number of difference sets of subsets of {1,2,...,n}, i.e., the size of {D(A) : A subset [n] }, where D(A)={a_i-a_j : a_i&gt;a_j and a_i,a_j in A}.
 * @author Sean A. Irvine
 */
public class A067247 extends Sequence1 {

  private int mN = 0;

  private long getDifference(final long s) {
    long d = 0;
    long t = s;
    for (int k = 1; t != 0; t >>>= 1, ++k) {
      if ((t & 1) == 1) {
        long u = t >>> 1;
        for (int j = k; u != 0; u >>>= 1, ++j) {
          if ((u & 1) == 1) {
            d |= 1L << (j - k);
          }
        }
      }
    }
    return d;
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> differences = new HashSet<>();
    for (long set = 0; set < 1L << mN; ++set) {
      differences.add(getDifference(set));
    }
    return Z.valueOf(differences.size());
  }
}

