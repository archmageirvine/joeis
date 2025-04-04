package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075085 a(n) is the smallest number not already in the sequence such that Sum_{k=1..n} a(k) is divisible by prime(n).
 * @author Sean A. Irvine
 */
public class A075085 extends A000040 {

  private final Set<Z> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z[] qr = mSum.divideAndRemainder(p);
    Z k = p.subtract(qr[1]);
    while (!mUsed.add(k)) {
      k = k.add(p);
    }
    mSum = mSum.add(k);
    return k;
  }
}

