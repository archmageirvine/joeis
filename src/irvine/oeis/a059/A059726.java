package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A059726 Row sums of A059720.
 * @author Sean A. Irvine
 */
public class A059726 extends A059720 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z[] values = step(++mN);
    return Functions.SUM.z(values);
  }
}

