package irvine.oeis.a343;
// manually 2026-10-04/adjext at 2026-10-04 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a011.A011772;

/**
 * A343997 a(n) = A011772(n) if that number is even, otherwise A011772(n)+1.
 * @author Georg Fischer
 */
public class A343997 extends AbstractSequence {

  private final Sequence mSeq = new A011772();

  /** Construct the sequence */
  public A343997() {
    super(1);
  }

  @Override
  public Z next() {
    Z t = mSeq.next();
    if (t.testBit(0)) {
      t = t.add(1);
    }
    return t;
  }
}
