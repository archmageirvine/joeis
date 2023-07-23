package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049847 a(n) = (2*n + 1 - prevprime(2*n+1))/2.
 * @author Sean A. Irvine
 */
public class A049847 extends AbstractSequence {

  private final A049716 mSeq1 = new A049716();

  /** Construct the sequence. */
  public A049847() {
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
