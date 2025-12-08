package irvine.oeis.a082;

import irvine.math.z.PellIterator;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A082393 Let p = n-th prime of the form 4k+1, take the integer solution (x,y) to the Pellian equation x^2 - p*y^2 = 1 with the smallest y &gt;= 1; sequence gives value of y.
 * @author Sean A. Irvine
 */
public class A082393 extends A002144 {

  @Override
  public Z next() {
    return new PellIterator(super.next()).next()[1];
  }
}
