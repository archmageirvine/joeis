package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026621 T(n,[ n/2 ]), T given by A026615.
 * @author Sean A. Irvine
 */
public class A026621 extends A026615 {

  /** Construct the sequence. */
  public A026621() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
