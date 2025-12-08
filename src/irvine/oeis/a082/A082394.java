package irvine.oeis.a082;

import irvine.math.z.PellIterator;
import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A082394 Let p = n-th prime of the form 4k+3, take the solution (x,y) to the Pellian equation x^2 - p*y^2 = 1 with x and smallest y &gt;= 1; sequence gives value of y.
 * @author Sean A. Irvine
 */
public class A082394 extends A002145 {

  @Override
  public Z next() {
    return new PellIterator(super.next()).next()[1];
  }
}
