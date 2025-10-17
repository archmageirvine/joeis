package irvine.oeis.a081;

import irvine.math.z.PellIterator;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A081232 Let p = n-th prime of the form 4k+1, take smallest solution (x,y) to the Pellian equation x^2 - p*y^2 = 1 with x and y &gt;= 1; sequence gives value of x.
 * @author Sean A. Irvine
 */
public class A081232 extends A002144 {

  @Override
  public Z next() {
    return new PellIterator(super.next()).next()[0];
  }
}
