package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A000822 Expansion of (sin^2 x + sin x) /cos 2x.
 * @author Sean A. Irvine
 */
public class A000822 extends Sequence0 {

  private boolean mSource = false;
  private final Sequence mA = new A000464();
  private final Sequence mB = new A000816();

  @Override
  public Z next() {
    mSource = !mSource;
    return mSource ? mB.next() : mA.next();
  }
}
