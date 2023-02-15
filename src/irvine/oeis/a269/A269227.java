package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A269227 Numbers n such that 7^n + 6^(n + 1) is prime.
 * @author Georg Fischer
 */
public class A269227 extends Sequence1 {

  private long mN;
  private final Z mBase1;
  private final Z mBase2;
  private final int mNadd;
  private final boolean mNeg;

  /** Construct the sequence. */
  public A269227() {
    this(7, 6, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param base1 first base
   * @param base2 second base
   * @param nadd increment of n
   */
  public A269227(final int base1, final int base2, final int nadd) {
    mN = nadd > 0 ? -1 : 0;
    mNeg = base2 < 0;
    mBase1 = Z.valueOf(base1);
    mBase2 = Z.valueOf(mNeg ? -base2 : base2);
    mNadd = nadd;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t2 = mBase2.pow(mN + mNadd);
      if ((mNeg ? mBase1.pow(mN).subtract(t2) : mBase1.pow(mN).add(t2)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
