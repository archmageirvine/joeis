package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057879 Primes with 3 distinct digits that remain prime (no leading zeros allowed) after deleting all occurrences of any one of its distinct digits.
 * @author Sean A. Irvine
 */
public class A057879 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(Functions.SYNDROME.i(p)) == 3 && A057876.is(p.toString())) {
        return p;
      }
    }
  }
}

