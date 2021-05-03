package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006369 a(n) = 2*n/3 for n divisible by 3, otherwise a(n) = round(4*n/3). Or, equivalently, a(3*n-2) = 4*n-3, a(3*n-1) = 4*n-1, a(3*n) = 2*n.
 * @author Sean A. Irvine
 */
public class A006369 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z t = mN.add(1);
    return mN.signedAdd(t.mod(3) != 1,  t.divide(3));
  }
}
