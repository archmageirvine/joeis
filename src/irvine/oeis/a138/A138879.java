package irvine.oeis.a138;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;

/**
 * A138879 Sum of all parts of the last section of the set of partitions of n.
 * @author Georg Fischer
 */
public class A138879 extends AbstractSequence {

  private A000041 mSeq1 = new A000041();
  private long mN;
  private Z mA;

  /** Construct the sequence. */
  public A138879() {
    super(1);
    mN = 0;
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A000041(n)*n - A000041(n-1)*(n-1)
    ++mN;
    final Z b = mSeq1.next();
    final Z result = b.multiply(mN).subtract(mA.multiply(mN - 1));
    mA = b;
    return result;
  }
}
