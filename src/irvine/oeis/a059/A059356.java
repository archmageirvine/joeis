package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a008.A008298;

/**
 * A059356 A diagonal of triangle in A008298.
 * @author Sean A. Irvine
 */
public class A059356 extends A008298 {

  /** Construct the sequence. */
  public A059356() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN).get(2);
  }
}
