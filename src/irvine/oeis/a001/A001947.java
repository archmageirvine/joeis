package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001947 <code>a(n) =</code> Lucas(5*n+2).
 * @author Sean A. Irvine
 */
public class A001947 implements Sequence {

  private int mN = -3;

  @Override
  public Z next() {
    mN += 5;
    return Fibonacci.lucas(mN);
  }
}
