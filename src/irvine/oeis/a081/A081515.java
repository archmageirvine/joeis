package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081515 Sum of terms in n-th row of A081517.
 * @author Sean A. Irvine
 */
public class A081515 extends A081517 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow);
  }
}
