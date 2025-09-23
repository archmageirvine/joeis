package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080507 Arithmetic mean of n-th row of A080504.
 * @author Sean A. Irvine
 */
public class A080507 extends A080504 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow).divide(mRow.length);
  }
}

