package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A054161 Number of positive integers &lt;= 2^n of form 3 x^2 + 3 y^2.
 * @author Sean A. Irvine
 */
public class A054161 extends A054150 {

  /** Construct the sequence. */
  public A054161() {
    super(new A001481() {
      @Override
      public Z next() {
        return super.next().multiply(3);
      }
    });
  }
}
