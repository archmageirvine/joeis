package irvine.oeis.a082;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.a026.A026741;

/**
 * A082928 If n is prime, a(n) = n+1; if n is even, a(n) = n/2; otherwise a(n) = n.
 * @author Georg Fischer
 */
public class A082928 extends AbstractSequence {

  private int mN = 0;
  private A026741 mSeq1 = new A026741();
  private A010051 mSeq2 = new A010051();

  /** Construct the sequence. */
  public A082928() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 2) ? Z.THREE : result;
  }
}
