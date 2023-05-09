package irvine.oeis.a307;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a247.A247451;

/**
 * A307107 a(n) = A025487(n)/A247451(n).
 * @author Georg Fischer
 */
public class A307107 extends AbstractSequence {

  private A025487 mSeq1 = new A025487();
  private A247451 mSeq2 = new A247451();

  /** Construct the sequence. */
  public A307107() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
