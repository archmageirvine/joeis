package irvine.oeis.a179;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a047.A047863;

/**
 * A179534 Number of labeled split graphs on n vertices.
 * @author Georg Fischer
 */
public class A179534 extends AbstractSequence {

  private final A047863 mSeq1 = new A047863();
  private long mN;
  private Z mA;

  /** Construct the sequence. */
  public A179534() {
    super(1);
    mN = 0;
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A047863(n) - n*A047863(n-1)
    ++mN;
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA.multiply(mN));
    mA = b;
    return result;
  }
}
