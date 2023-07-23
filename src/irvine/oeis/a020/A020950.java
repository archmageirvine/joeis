package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A020950 a(n) = k-1, where k is smallest number such that A002487(k) = n.
 * @author Sean A. Irvine
 */
public class A020950 extends AbstractSequence {

  private final A020946 mSeq1 = new A020946();

  /** Construct the sequence. */
  public A020950() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(1);
  }
}
