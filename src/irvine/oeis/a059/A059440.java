package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059440 A diagonal of A059438.
 * @author Sean A. Irvine
 */
public class A059440 extends A059438 {

  /** Construct the sequence. */
  public A059440() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}
