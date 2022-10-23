package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023800 Xenodromes: all digits in base 5 are different.
 * @author Sean A. Irvine
 */
public class A023800 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private final int mBase;

  protected A023800(final int base) {
    mBase = base;
    for (long k = 0; k < base; ++k) {
      mA.add(k);
    }
  }

  /** Construct the sequence. */
  public A023800() {
    this(5);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final long a = mA.pollFirst();
    if (a != 0) {
      long m = a;
      int used = 0;
      while (m != 0) {
        used |= 1 << (m % mBase);
        m /= mBase;
      }
      for (int k = 0, j = 1; k < mBase; ++k, j <<= 1) {
        if ((used & j) == 0) {
          mA.add(a * mBase + k);
        }
      }
    }
    return Z.valueOf(a);
  }
}

