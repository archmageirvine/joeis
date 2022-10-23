package irvine.oeis.a277;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A277548 Numbers k such that k/5^m == 4 (mod 5), where 5^m is the greatest power of 5 that divides k.
 * @author Georg Fischer
 */
public class A277548 extends Sequence1 {

  private long mK;
  private long mBase;
  private long mMod;

  /** Construct the sequence. */
  public A277548() {
    this(5, 4);
  }

  /**
   * Generic constructor with parameters
   * @param base numbers base
   * @param mod relevant residue
   */
  public A277548(final int base, final int mod) {
    mBase = base;
    mMod = mod;
    mK = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      long num = mK;
      long residue;
      while ((residue = num % mBase) == 0 && num > 0) {
        num /= mBase;
      }
      if (residue == mMod) {
        return Z.valueOf(mK);
      }
    }
  }
}
