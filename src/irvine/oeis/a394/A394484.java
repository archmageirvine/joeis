package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a214.A214664;
import irvine.oeis.a214.A214665;

/**
 * A394484 allocated for Aitzaz Imtiaz.
 * @author Sean A. Irvine
 */
public class A394484 extends Sequence1 {

  private final Sequence mXSeq = new A214664();
  private final Sequence mYSeq = new A214665();
  private Z mX = mXSeq.next();
  private Z mY = mYSeq.next();

  @Override
  public Z next() {
    final Z x = mX;
    final Z y = mY;
    mX = mXSeq.next();
    mY = mYSeq.next();
    return mX.subtract(x).abs().max(mY.subtract(y).abs());
  }
}
