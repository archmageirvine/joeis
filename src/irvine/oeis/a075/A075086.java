package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A075086 Rearrangement of natural numbers such that the n-th partial sum is divisible by the n-th composite number.
 * @author Sean A. Irvine
 */
public class A075086 extends A002808 {

  private final Set<Z> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z c = super.next();
    final Z[] qr = mSum.divideAndRemainder(c);
    Z k = c.subtract(qr[1]);
    while (!mUsed.add(k)) {
      k = k.add(c);
    }
    mSum = mSum.add(k);
    return k;
  }
}

