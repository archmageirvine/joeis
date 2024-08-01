package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a061.A061579;

/**
 * A071642.
 * @author Sean A. Irvine
 */
public class A071651 extends Sequence0 {

  // todo this is not correct

  private final DirectSequence mA = DirectSequence.create(new A014486());
  private final Sequence mB = new A061579();

  @Override
  public Z next() {
    return mA.a(mB.next().intValueExact());
  }
}
