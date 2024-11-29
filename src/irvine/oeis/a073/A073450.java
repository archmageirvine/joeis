package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073450 Triangle T(j,k) = remainder of Fibonacci(j) divided by Fibonacci(k), for 3 &lt; j and 2 &lt; k &lt; j.
 * @author Sean A. Irvine
 */
public class A073450 extends Sequence0 {

  private int mN = 3;
  private int mM = 3;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 3;
    }
    return Functions.FIBONACCI.z(mN).mod(Functions.FIBONACCI.z(mM));
  }
}

