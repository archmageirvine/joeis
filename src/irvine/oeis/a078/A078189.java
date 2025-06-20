package irvine.oeis.a078;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;
import irvine.util.Permutation;

/**
 * A078189 Array read by rows in which the n-th row contains the multiples of n in increasing order using all the digits of first n numbers.
 * @author Sean A. Irvine
 */
public class A078189 extends A007908 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      final Permutation perm = Permutation.permuter(super.next());
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z c = Permutation.permToZ(p);
          if (c.mod(mN) == 0) {
            mA.add(c);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

