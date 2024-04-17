package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046338 Palindromes &gt; 0 with an even number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046338 extends A002113 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.BIG_OMEGA.l(t) & 1) == 0) {
        return t;
      }
    }
  }
}
