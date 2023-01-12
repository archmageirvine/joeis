package irvine.oeis.a136;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A136719 Number of labeled directed trees with n nodes.
 * @author Georg Fischer
 */
public class A136719 extends AbstractSequence {

  private long mN;

  /** Construct the sequence. */
  public A136719() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    // a(n) = 3*(3*n)^(n-2).
    ++mN;
    return (mN == 1) ? Z.ONE : Z.valueOf(3 * mN).pow(mN - 2).multiply(3);
  }
}
