package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a019.A019518;
import irvine.oeis.a052.A052495;
import irvine.util.Permutation;

/**
 * A053095 Number of primes having exactly the same digits as appear in first n primes.
 * @author Sean A. Irvine
 */
public class A053095 extends A019518 {

  @Override
  public Z next() {
    final Z m = super.next();
    if (ZUtils.digitSum(m) % 3 == 0) {
      return Z.ZERO;
    }
    long cnt = 0;
    final Permutation perm = A052495.permuter(m);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0 && A052495.permToZ(p).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
