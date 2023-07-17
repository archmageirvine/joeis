package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000378;

/**
 * A047809 a(n) counts different values of i^2+j^2+k^2 &lt;= n^2 or number of distances from the origin to all integer points inside a sphere of radius n.
 * @author Sean A. Irvine
 */
public class A047809 extends A000378 {

  /** Construct the sequence. */
  public A047809() {
    super(0);
  }

  private Z mA = super.next();
  private long mC = 0;
  private long mN = -1;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    while (mA.compareTo(n2) <= 0) {
      ++mC;
      mA = super.next();
    }
    return Z.valueOf(mC);
  }
}
