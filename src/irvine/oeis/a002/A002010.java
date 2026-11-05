package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A002010 Number of rooted planar maps with 2n trivalent vertices and a root vertex of valence 8.
 * @author Sean A. Irvine
 */
public class A002010 extends Sequence0 {

  private final Sequence mS = new A002005().skip();
  private final Sequence mC = new ConvolutionSequence(new A002005());
  private Z mA = mS.next();
  private Z mB = mS.next();
  private Z mD = mC.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mS.next();
    final Z u = mD;
    mD = mC.next();
    return mB.subtract(mA.multiply(10)).add(t.multiply(18)).subtract(mD.multiply(10)).add(u.multiply(6));
  }
}
