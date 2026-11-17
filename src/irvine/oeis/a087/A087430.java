package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A087430 Nonprimes n with gpf(n) &gt; gpf(n+1), where gpf=A006530 (greatest prime factor).
 * @author Sean A. Irvine
 */
public class A087430 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Functions.GPF.z(n).compareTo(Functions.GPF.z(n.add(1))) > 0) {
        return n;
      }
    }
  }
}
