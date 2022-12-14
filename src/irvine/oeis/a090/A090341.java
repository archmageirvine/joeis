package irvine.oeis.a090;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001414;

/**
 * A090341 Difference between the sums of the prime factors, including multiplicity, of n and those of n + 2.
 * @author Georg Fischer
 */
public class A090341 extends AbstractSequence {

  private A001414 mSeq1 = new A001414();
  private Z mA;
  private Z mB;

  /** Construct the sequence. */
  public A090341() {
    super(1);
    mA = mSeq1.next();
    mB = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z c = mSeq1.next();
    final Z result = mA.subtract(c);
    mA = mB;
    mB = c;
    return result;
  }
}
