package irvine.oeis.a129;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001227;

/**
 * A129574 Number of odd divisors of n plus the number of odd divisors of n - 1.
 * @author Georg Fischer
 */
public class A129574 extends AbstractSequence {

  private final A001227 mSeq1 = new A001227();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A129574() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
