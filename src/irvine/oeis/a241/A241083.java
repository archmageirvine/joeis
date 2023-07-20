package irvine.oeis.a241;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000196;

/**
 * A241083 LCM of n and largest integer &lt;= sqrt(n).
 * @author Georg Fischer
 */
public class A241083 extends AbstractSequence {

  private int mN;
  private A000196 mSeq1 = new A000196();

  /** Construct the sequence. */
  public A241083() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).lcm(mSeq1.next());
  }
}
