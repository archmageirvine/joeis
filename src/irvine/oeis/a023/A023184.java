package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A023184 Least Fibonacci number ending with n.
 * @author Sean A. Irvine
 */
public class A023184 implements Sequence {

  private long mN = -1;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    final Sequence fibo = new A000045();
    Z f;
    do {
      f = fibo.next();
    } while (f.mod(mM) != mN);
    return f;
  }
}

