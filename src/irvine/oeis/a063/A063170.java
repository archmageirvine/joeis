package irvine.oeis.a063;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A063170 Schenker sums with n-th term.
 * @author Georg Fischer
 */
public class A063170 extends AbstractSequence {

  private final A063169 mSeq1 = new A063169();
  private long mN;

  /** Construct the sequence. */
  public A063170() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().add(Z.valueOf(mN).pow(mN));
  }
}
