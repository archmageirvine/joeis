package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;
import irvine.util.Permutation;

/**
 * A077193 Number of multiples of n that can be obtained by permuting the digits of number formed by the concatenation of first n numbers.
 * @author Sean A. Irvine
 */
public class A077193 extends A007908 {

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(super.next());
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      final Z t = Permutation.permToZ(p);
      if (t.mod(mN) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

