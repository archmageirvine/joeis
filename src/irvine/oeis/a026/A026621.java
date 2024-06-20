package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026621 a(n) = A026615(n, floor(n/2)).
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
