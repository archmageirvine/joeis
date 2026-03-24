package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a214.A214664;
import irvine.oeis.a214.A214665;

/**
 * A388723 allocated for Aitzaz Imtiaz.
 * @author Sean A. Irvine
 */
public class A388723 extends Sequence1 {

  private final Sequence mX = new A214664();
  private final Sequence mY = new A214665();

  @Override
  public Z next() {
    return mX.next().abs().add(mY.next().abs());
  }
}
