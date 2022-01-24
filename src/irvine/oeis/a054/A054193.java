package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A054193 Number of positive integers &lt;= 2^n of form 9 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054193 extends A054150 {

  /** Construct the sequence. */
  public A054193() {
    super(new A001481() {
      @Override
      public Z next() {
        return super.next().multiply(9);
      }
    });
  }
}
