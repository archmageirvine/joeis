package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069063 Composite k such that A029939(k) &gt; k*(k+1)/2 where A029939(k) = Sum_{d|k} phi(d)^2.
 * @author Sean A. Irvine
 */
public class A069063 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Integers.SINGLETON.sumdiv(n.intValueExact(), d -> Functions.PHI.z((long) d).square()).compareTo(n.multiply(n.add(1)).divide2()) > 0) {
        return n;
      }
    }
  }
}

