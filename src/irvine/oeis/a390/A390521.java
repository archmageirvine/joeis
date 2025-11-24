package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390521 a(n) = limiting prime of the recurrence x(k) = 1 + (phi(x(k-1)) + phi(x(k-2))) / 2 started at x(0) = x(1) = n.
 * @author Sean A. Irvine
 */
public class A390521 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z x0 = Z.valueOf(++mN);
    Z x1 = x0;
    while (!x1.isProbablePrime() || !x1.equals(x0)) {
      final Z t = Functions.PHI.z(x0).add(Functions.PHI.z(x1)).divide2().add(1);
      x0 = x1;
      x1 = t;
    }
    return x1;
  }
}

