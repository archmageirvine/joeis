package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001602;

/**
 * A053028 Odd primes p with 4 zeros in any period of the Fibonacci numbers mod p.
 * @author Sean A. Irvine
 */
public class A053028 extends A001602 {

  private final Sequence mP = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP.next();
      if (super.next().isOdd() && p.isOdd()) {
        return p;
      }
    }
  }
}
