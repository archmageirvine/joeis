package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054054;
import irvine.oeis.a054.A054055;

/**
 * A073730 Concatenation of largest and smallest digits of n in decimal representation.
 * @author Georg Fischer
 */
public class A073730 extends Sequence1 {

  private final A054055 mSeq1 = new A054055();
  private final A054054 mSeq2 = new A054054();

  {
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(10).add(mSeq2.next());
  }
}
