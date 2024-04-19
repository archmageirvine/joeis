package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081642 Integers congruent to 0, 1 or 4 (mod 9) which are not squares.
 * @author Georg Fischer
 */
public class A081642 extends Sequence1 {

  private long mN;
  private final long mBase;
  private final long mMod;

  /** Construct the sequence. */
  public A081642() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param base modulo base
   */
  public A081642(final long base) {
    mN = 0;
    mBase = base;
    mMod = base * base;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int i = 0;
      boolean busy = true;
      while (busy && i < mBase) {
        final int i2 = i * i;
        if (mN % mMod == i2) {
          busy = false;
        }
        ++i;
      }
      if (!busy) { // was congruent somewhere
        final Z result = Z.valueOf(mN);
        if (!result.isSquare()) {
          return result;
        }
      }
    }
  }
}
