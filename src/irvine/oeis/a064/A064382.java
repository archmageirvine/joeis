package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a022.A022915;

/**
 * A064382 Number of ways to put numbers 1, 2, ..., n*(n+1)/2 in a triangular array of n rows in such a way that each row is increasing or decreasing.
 * @author Sean A. Irvine
 */
public class A064382 extends A022915 {

  private long mN = -1;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
