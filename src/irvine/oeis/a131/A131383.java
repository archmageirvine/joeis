package irvine.oeis.a131;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a043.A043306;

/**
 * A131383 Total digital sum of n: sum of the digital sums of n for all the bases 1 to n (a 'digital sumorial').
 * @author Georg Fischer
 */
public class A131383 extends AbstractSequence {

  private A043306 mSeq1 = new A043306();
  private long mN;

  /** Construct the sequence. */
  public A131383() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : mSeq1.next().add(mN);
  }
}
