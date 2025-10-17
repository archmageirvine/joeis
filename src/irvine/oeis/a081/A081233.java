package irvine.oeis.a081;

import irvine.math.z.PellIterator;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081233 Let p = n-th prime, take smallest solution (x,y) to the Pellian equation x^2 - p*y^2 = 1 with x and y &gt;= 1; sequence gives value of x.
 * @author Sean A. Irvine
 */
public class A081233 extends A000040 {

  @Override
  public Z next() {
    return new PellIterator(super.next()).next()[0];
  }
}
