package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047982 a(n) = A047980(2n+1).
 * @author Sean A. Irvine
 */
public class A047982 extends AbstractSequence {

  private final A047980 mSeq1 = new A047980();

  /** Construct the sequence. */
  public A047982() {
    super(0);
  }

  @Override
  public Z next() {
    final Z res = mSeq1.next();
    mSeq1.next();
    return res;
  }
}
