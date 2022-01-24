package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002479;

/**
 * A054163 Number of positive integers &lt;= 2^n of form 3 x^2 + 6 y^2.
 * @author Sean A. Irvine
 */
public class A054163 extends A054150 {

  /** Construct the sequence. */
  public A054163() {
    super(new A002479() {
      @Override
      public Z next() {
        return super.next().multiply(3);
      }
    });
  }
}
