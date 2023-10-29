package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003559 Least number m such that 3^m == +- 1 (mod 3n + 1).
 * @author Sean A. Irvine
 */
public class A003559 extends Sequence0 {

  private final long mS;
  private long mN = 1;

  protected A003559(final int s) {
    mS = s;
  }

  /** Construct the sequence. */
  public A003559() {
    this(3);
  }

  @Override
  public Z next() {
    mN += mS;
    long m = 0;
    long power = 1;
    do {
      power *= mS;
      power %= mN;
      ++m;
    } while (power != 1 && power != mN - 1);
    return Z.valueOf(m);
  }
}
