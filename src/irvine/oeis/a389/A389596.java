package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024451;

/**
 * A389596 Harmonic-mean index of primes: a(1) = 0 and thereafter a(n) = floor( n / (2*H(n)) ), where H(n) = Sum_{k=1..n} 1/prime(k).
 * @author Sean A. Irvine
 */
public class A389596 extends Sequence1 {

  private final Sequence mA = new A024451().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Functions.PRIMORIAL_COUNT.z(mN).multiply(mN).divide2().divide(mA.next());
  }
}

