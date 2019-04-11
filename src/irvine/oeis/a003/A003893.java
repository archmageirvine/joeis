package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003893 <code>a(n) =</code> Fibonacci(n) <code>mod 10</code>.
 * @author Sean A. Irvine
 */
public class A003893 implements Sequence {

  private int mA = 9;
  private int mB = 1;

  @Override
  public Z next() {
    final int t = (mA + mB) % 10;
    mA = mB;
    mB = t;
    return Z.valueOf(t);
  }
}
