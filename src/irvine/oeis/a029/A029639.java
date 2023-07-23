package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029639 Odd numbers in the (1,2)-Pascal triangle A029635 that are different from 1.
 * @author Sean A. Irvine
 */
public class A029639 extends AbstractSequence {

  private final A029638 mSeq1 = new A029638();

  /** Construct the sequence. */
  public A029639() {
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
