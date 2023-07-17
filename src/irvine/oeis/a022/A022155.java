package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a020.A020985;

/**
 * A022155 Values of n at which Golay-Rudin-Shapiro sequence A020985 is negative.
 * @author Sean A. Irvine
 */
public class A022155 extends A020985 {

  /** Construct the sequence. */
  public A022155() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().signum() < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
