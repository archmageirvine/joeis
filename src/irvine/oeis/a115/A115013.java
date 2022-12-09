package irvine.oeis.a115;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a073.A073481;
import irvine.oeis.a073.A073482;

/**
 * A115013 a(n) = difference between largest and smallest primes dividing the n-th squarefree integer (with a(1)=0).
 * @author Georg Fischer
 */
public class A115013 extends AbstractSequence {

  private A073482 mSeq1 = new A073482();
  private A073481 mSeq2 = new A073481();

  /** Construct the sequence. */
  public A115013() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
