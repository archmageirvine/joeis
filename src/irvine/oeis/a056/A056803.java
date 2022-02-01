package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056803 Numbers n such that 12 repeated n times followed by 1 is a palindromic prime.
 * @author Georg Fischer
 */
public class A056803 implements Sequence {

  private int mN;
  private Z mK;

  /** Construct the sequence. */
  public A056803() {
    mN = 0;
    mK = Z.ONE;
  }

  @Override
  public Z next() {
    while (!mK.isProbablePrime()) {
      ++mN;
      mK = mK.multiply(100).add(21);
    }
    mK = mK.multiply(100).add(21);
    return Z.valueOf(mN++);
  }
}
