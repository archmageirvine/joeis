package irvine.oeis.a122;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054895;

/**
 * A122841 Greatest k such that 6^k divides n.
 * @author Georg Fischer
 */
public class A122841 extends AbstractSequence {

  private final A054895 mSeq1 = new A054895();
  private Z mA;

  /** Construct the sequence. */
  public A122841() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
