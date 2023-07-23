package irvine.oeis.a146;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061045;

/**
 * A146539 A061045 mod 9.
 * @author Georg Fischer
 */
public class A146539 extends AbstractSequence {

  private final A061045 mSeq1 = new A061045();

  /** Construct the sequence. */
  public A146539() {
    super(0);
    for (int i = 1; i <= 5; ++i) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(Z.NINE);
  }

}
