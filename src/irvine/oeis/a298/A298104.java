package irvine.oeis.a298;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001187;

/**
 * A298104 Number of connected dominating sets in the n-triangular graph.
 * @author Georg Fischer
 */
public class A298104 extends AbstractSequence {

  private A001187 mSeq1 = new A001187();
  private long mN;
  private Z mA;

  /** Construct the sequence. */
  public A298104() {
    super(2);
    mN = 1;
    mA = mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z b = mSeq1.next();
    if (mN == 2) {
      mA = b;
      return Z.ONE;
    }
    final Z result = b.add(mA.multiply(mN));
    mA = b;
    return result;
  }
}
