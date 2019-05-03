package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003569 <code>a(n) =</code> least positive number m such that <code>4^m == +1</code> or <code>-1 mod 2n + 1</code>, with <code>a(0) = 0</code> by convention.
 * @author Sean A. Irvine
 */
public class A003569 implements Sequence {

  private long mN = -1;
  private long mS = 4;

  protected A003569(final long s) {
    mS = s;
  }

  /** Construct the sequence. */
  public A003569() {
    this(4);
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return this instanceof A003558 ? Z.ONE : Z.ZERO;
    }
    long m = 1;
    long power = mS % mN;
    while (power != 1 && power != mN - 1) {
      power *= mS;
      power %= mN;
      ++m;
    }
    return Z.valueOf(m);
  }
}
