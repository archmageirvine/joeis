package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A014286 <code>a(n) =</code> Sum_{i=0..n} i*Fibonacci(i).
 * @author Sean A. Irvine
 */
public class A014286 extends A000045 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mA = mA.add(super.next().multiply(++mN));
    return mA;
  }
}

