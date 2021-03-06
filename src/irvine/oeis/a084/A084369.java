package irvine.oeis.a084;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084369 Numbers n such that the n-th prime number doesn't contain any even digits.
 * @author Georg Fischer
 */
public class A084369 extends A000040 {
  protected long mK = 0;
  protected Z mNP = null;

  protected boolean isOk() {
    return !mNP.toString().matches(".*[02468].*");
  }

  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (!isOk()) {
      ++mK;
      mNP = super.next();
    }
    return Z.valueOf(mK);
  }
}
