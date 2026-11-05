package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A002009 Almost trivalent maps.
 * @author Sean A. Irvine
 */
public class A002009 extends Sequence0 {

  private final Sequence mS = new A002005().skip();
  private final Sequence mC = new ConvolutionSequence(new A002005()).skip();
  private Z mA = mS.next();
  private Z mB = mS.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mS.next();
    return mB.subtract(mA.multiply(8)).add(t.multiply(6)).subtract(mC.next().multiply(6));
  }
}
