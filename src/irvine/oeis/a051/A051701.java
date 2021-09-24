package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051701 Closest prime to n-th prime p that is different from p (break ties by taking the smaller prime).
 * @author Sean A. Irvine
 */
public class A051701 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z prev = mPrime.prevPrime(p);
    final Z next = mPrime.nextPrime(p);
    if (prev.signum() <= 0 || next.subtract(p).compareTo(p.subtract(prev)) < 0) {
      return next;
    } else {
      return prev;
    }
  }
}
