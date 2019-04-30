package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006369 <code>a(n) = 2n/3</code> for n divisible by 3, otherwise <code>a(n) = round(4n/3)</code>.
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
