package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002479;

/**
 * A054180 Number of positive integers &lt;= 2^n of form 5 x^2 + 10 y^2.
 * @author Sean A. Irvine
 */
public class A054180 extends A054150 {

  /** Construct the sequence. */
  public A054180() {
    super(new A002479() {
      @Override
      public Z next() {
        return super.next().multiply(5);
      }
    });
  }
}
