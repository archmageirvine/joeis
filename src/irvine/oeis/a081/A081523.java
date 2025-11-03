package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081523 Sum of terms in row n of A081521.
 * @author Sean A. Irvine
 */
public class A081523 extends A081521 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow);
  }
}
