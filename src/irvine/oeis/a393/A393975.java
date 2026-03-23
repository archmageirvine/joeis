package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;

/**
 * A393975 Primes that can be written as p + r where p is a prime and r is an anagram of p.
 * @author Sean A. Irvine
 */
public class A393975 extends A000040 {

  private final DirectSequence mS = new A393958();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!mS.a(p).isZero()) {
        return p;
      }
    }
  }
}
