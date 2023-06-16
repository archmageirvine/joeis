package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057001 (phi(n+1)-phi(n))/2.
 * @author Sean A. Irvine
 */
public class A057001 extends AbstractSequence {

  private final A057000 mSeq = new A057000();

  /** Construct the sequence. */
  public A057001() {
    super(3);
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
