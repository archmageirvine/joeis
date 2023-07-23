package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029641 Even numbers in the (1,2)-Pascal triangle A029635 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029641 extends AbstractSequence {

  private final A029640 mSeq1 = new A029640();

  /** Construct the sequence. */
  public A029641() {
    super(0);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = mSeq1.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
