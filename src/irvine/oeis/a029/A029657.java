package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029657 Odd numbers in (2,1)-Pascal triangle A029653 that are different from 1.
 * @author Sean A. Irvine
 */
public class A029657 extends AbstractSequence {

  private final A029656 mSeq1 = new A029656();

  /** Construct the sequence. */
  public A029657() {
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
