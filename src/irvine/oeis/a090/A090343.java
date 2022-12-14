package irvine.oeis.a090;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001414;

/**
 * A090343 Difference between the sums of the prime factors, including multiplicity, of n and those of n + 4.
 * @author Georg Fischer
 */
public class A090343 extends AbstractSequence {

  private A001414 mSeq1 = new A001414();
  private Z mA;
  private Z mB;
  private Z mC;
  private Z mD;

  /** Construct the sequence. */
  public A090343() {
    super(1);
    mA = mSeq1.next();
    mB = mSeq1.next();
    mC = mSeq1.next();
    mD = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z e = mSeq1.next();
    final Z result = mA.subtract(e);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = e;
    return result;
  }
}
