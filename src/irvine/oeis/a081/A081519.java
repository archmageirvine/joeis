package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081519 Sum of terms in row n of A081520.
 * @author Sean A. Irvine
 */
public class A081519 extends A081520 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow);
  }
}
