package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A123340 Least m such that 2^n+3^m is prime.
 * @author Georg Fischer
 */
public class A123340 implements Sequence {

  private int mN;
  private Z mBase1;
  private Z mBase2;

  /** Construct the sequence. */
  public A123340() {
    this(2, 3);
  }

  /**
   * Generic constructor with parameters
   * @param base1
   * @param base2
   */
  public A123340(final int base1, final int base2) {
    mN = -1;
    mBase1 = Z.valueOf(base1);
    mBase2 = Z.valueOf(base2);
  }

  @Override
  public Z next() {
    ++mN;
    int k = -1;
    while (true) {
      ++k;
      if (mBase1.pow(mN).add(mBase2.pow(k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
