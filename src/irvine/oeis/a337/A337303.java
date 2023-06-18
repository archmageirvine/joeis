package irvine.oeis.a337;
// manually andiv 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A337303 Number of X-based filling of diagonals in a diagonal Latin square of order n.
 * @author Georg Fischer
 */
public class A337303 extends Sequence0 {

  private final A337302 mSeq1 = new A337302();
  private int mN = -1;

  @Override
  public Z next() {
    return mSeq1.next().multiply(MemoryFactorial.SINGLETON.factorial(++mN));
  }
}
