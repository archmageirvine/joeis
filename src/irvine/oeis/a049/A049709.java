package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049709 a(n) = (1/2) * Sum_{i=0..n} T(i,n-i), array T as in A049704.
 * @author Sean A. Irvine
 */
public class A049709 extends AbstractSequence {

  private final A049708 mSeq1 = new A049708();

  /** Construct the sequence. */
  public A049709() {
    super(3);
  }

  {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
