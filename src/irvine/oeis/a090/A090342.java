package irvine.oeis.a090;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001414;

/**
 * A090342 Difference between the sums of the prime factors, including multiplicity, of n and those of n + 3.
 * @author Georg Fischer
 */
public class A090342 extends AbstractSequence {

  private final A001414 mSeq1 = new A001414();
  private Z mA;
  private Z mB;
  private Z mC;

  /** Construct the sequence. */
  public A090342() {
    super(1);
    mA = mSeq1.next();
    mB = mSeq1.next();
    mC = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z d = mSeq1.next();
    final Z result = mA.subtract(d);
    mA = mB;
    mB = mC;
    mC = d;
    return result;
  }
}
