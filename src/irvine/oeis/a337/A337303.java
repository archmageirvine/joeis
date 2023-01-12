package irvine.oeis.a337;
// manually andiv 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A337303 Number of X-based filling of diagonals in a diagonal Latin square of order n.
 * @author Georg Fischer
 */
public class A337303 extends AbstractSequence {

  private A337302 mSeq1 = new A337302();
  private int mN;

  /** Construct the sequence. */
  public A337303() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(MemoryFactorial.SINGLETON.factorial(++mN));
  }
}
