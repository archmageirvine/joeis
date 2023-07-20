package irvine.oeis.a078;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052429;

/**
 * A078547 a(n) = lcm(n, A052429(n)) - n.
 * @author Georg Fischer
 */
public class A078547 extends AbstractSequence {

  private int mN;
  private A052429 mSeq1 = new A052429();

  /** Construct the sequence. */
  public A078547() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).lcm(mSeq1.next()).subtract(mN);
  }
}
