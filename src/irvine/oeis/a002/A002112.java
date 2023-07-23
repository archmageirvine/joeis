package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002112 Glaisher's H numbers.
 * @author Sean A. Irvine
 */
public class A002112 extends AbstractSequence {

  private final A002114 mSeq1 = new A002114();

  /** Construct the sequence. */
  public A002112() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(3);
  }
}
