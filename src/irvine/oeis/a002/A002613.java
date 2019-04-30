package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002613 Glaisher's function <code>J(n) (18</code> squares version).
 * @author Sean A. Irvine
 */
public class A002613 implements Sequence {

  private final Sequence mA = new A002609();
  private final Sequence mB = new A002609();

  @Override
  public Z next() {
    // mA steps at twice the rate of mB
    mA.next();
    return mA.next().add(mB.next().multiply(16)).divide(-4);
  }
}
