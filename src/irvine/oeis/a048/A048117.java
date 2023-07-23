package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048117 a(n)=(1/2)*T(2n,n), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048117 extends AbstractSequence {

  private final A048116 mSeq1 = new A048116();

  /** Construct the sequence. */
  public A048117() {
    super(2);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
