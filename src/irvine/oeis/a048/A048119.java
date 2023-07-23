package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048119 a(n)=(1/2)*T(2n+1,n+1), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048119 extends AbstractSequence {

  private final A048118 mSeq1 = new A048118();

  /** Construct the sequence. */
  public A048119() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
