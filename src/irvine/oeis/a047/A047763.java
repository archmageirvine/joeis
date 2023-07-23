package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047763 a(n) = A047762(2n+1).
 * @author Sean A. Irvine
 */
public class A047763 extends AbstractSequence {

  private final A047762 mSeq1 = new A047762();

  /** Construct the sequence. */
  public A047763() {
    super(0);
  }

  @Override
  public Z next() {
    final Z res = mSeq1.next();
    mSeq1.next();
    return res;
  }
}
