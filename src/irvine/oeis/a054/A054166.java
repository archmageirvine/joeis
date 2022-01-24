package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A054166 Number of positive integers &lt;= 2^n of form 3 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054166 extends A054150 {

  /** Construct the sequence. */
  public A054166() {
    super(new A003136() {
      @Override
      public Z next() {
        return super.next().multiply(3);
      }
    });
  }
}
