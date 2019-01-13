package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003559.
 * @author Sean A. Irvine
 */
public class A003559 implements Sequence {

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
