package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A002007 Almost trivalent maps.
 * @author Sean A. Irvine
 */
public class A002007 extends Sequence0 {

  private final Sequence mS = new A002005().skip();
  private final Sequence mC = new ConvolutionSequence(new A002005());
  private Z mA = mS.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.subtract(t.multiply(4)).subtract(mC.next());
  }
}
