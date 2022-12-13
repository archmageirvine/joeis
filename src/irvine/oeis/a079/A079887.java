package irvine.oeis.a079;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002330;
import irvine.oeis.a002.A002331;

/**
 * A079887 Values of y-x where p runs through the primes of form 4k+1 and p=x^2+y^2, 0&lt;=x&lt;=y.
 * @author Georg Fischer
 */
public class A079887 extends AbstractSequence {

  private A002330 mSeq1 = new A002330();
  private A002331 mSeq2 = new A002331();

  /** Construct the sequence. */
  public A079887() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
