package irvine.oeis.a288;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007865;

/**
 * A288728 Number of sum-free sets that can be created by adding n to all sum-free sets [1..n-1].
 * @author Georg Fischer
 */
public class A288728 extends AbstractSequence {

  private A007865 mSeq1 = new A007865();
  private Z mA;
  private int mN = 1;

  /** Construct the sequence. */
  public A288728() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 2) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
