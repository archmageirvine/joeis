package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001177;

/**
 * A037943 Smallest Fibonacci number that has n as a factor, divided by n.
 * @author Sean A. Irvine
 */
public class A037943 extends A001177 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next()).divide(++mN);
  }
}


