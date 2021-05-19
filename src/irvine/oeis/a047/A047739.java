package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.oeis.a046.A046759;

/**
 * A047739 Economical palindromes.
 * @author Sean A. Irvine
 */
public class A047739 extends A002113 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (A046759.isEconomical(palin.longValueExact())) {
        return palin;
      }
    }
  }
}
