package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002609 Glaisher's function <code>G(n) (18</code> squares <code>version)</code>.
 * @author Sean A. Irvine
 */
public class A002609 implements Sequence {

  private final Sequence mA = new A002611();
  private final Sequence mB = new A002611();

  @Override
  public Z next() {
    // mA steps at twice the rate of mB
    mA.next();
    return mA.next().subtract(mB.next().multiply(16));
  }
}
