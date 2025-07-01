package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A078449 a(n) = sum of terms in n-th row of A078448.
 * @author Sean A. Irvine
 */
public class A078449 extends A078448 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow);
  }
}


