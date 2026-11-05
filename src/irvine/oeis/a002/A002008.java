package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A002008 Almost trivalent maps.
 * @author Sean A. Irvine
 */
public class A002008 extends Sequence0 {

  private final Sequence mS = new A002005().skip();
  private final Sequence mC = new ConvolutionSequence(new A002005());
  private Z mA = mS.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.subtract(t.multiply(6)).subtract(mC.next().multiply(3));
  }
}
