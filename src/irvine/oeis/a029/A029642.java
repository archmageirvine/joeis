package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029642 Distinct odd numbers in the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029642 extends AbstractSequence {

  private final A029636 mSeq1 = new A029636();

  /** Construct the sequence. */
  public A029642() {
    super(0);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = mSeq1.next();
    } while (t.isEven());
    return t;
  }
}
