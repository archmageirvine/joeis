package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059510 Main diagonal of the array A059220.
 * @author Sean A. Irvine
 */
public class A059510 extends A059219 {

  /** Construct the sequence. */
  public A059510() {
    super(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
