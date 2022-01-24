package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002480;

/**
 * A054184 Number of positive integers &lt;= 2^n of form 6 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054184 extends A054150 {

  /** Construct the sequence. */
  public A054184() {
    super(new A002480() {
      @Override
      public Z next() {
        return super.next().multiply(3);
      }
    });
  }
}
