package irvine.oeis.a078;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052429;

/**
 * A078548 a(n) = lcm(n, A052429(n)) - A052429(n).
 * @author Georg Fischer
 */
public class A078548 extends AbstractSequence {

  private int mN;
  private A052429 mSeq1 = new A052429();

  /** Construct the sequence. */
  public A078548() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z t1 = mSeq1.next();
    return Z.valueOf(mN).lcm(t1).subtract(t1);
  }
}
