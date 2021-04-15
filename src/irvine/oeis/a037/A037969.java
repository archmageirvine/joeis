package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037969 Numbers whose maximal base-2 run length is 2.
 * @author Sean A. Irvine
 */
public class A037969 implements Sequence {

  private long mN = 0;

  private boolean isMaxRunLength(long n, final int runLength, final int base) {
    int l = 0;
    long prev = -1;
    boolean ok = false;
    while (n != 0) {
      final long digit = n % base;
      if (digit == prev) {
        if (++l > runLength) {
          return false;
        }
      } else {
        if (l == runLength) {
          ok = true;
        }
        prev = digit;
        l = 1;
      }
      n /= base;
    }
    return ok || l == runLength;
  }

  protected int runLength() {
    return 2;
  }

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (isMaxRunLength(++mN, runLength(), base())) {
        return Z.valueOf(mN);
      }
    }
  }
}
