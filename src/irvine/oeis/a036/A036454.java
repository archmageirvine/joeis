package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A036454 Prime powers with special exponents: q^(p-1) where p &gt; 2 and q are prime numbers.
 * @author Sean A. Irvine
 */
public class A036454 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z composite = super.next();
      if (Cheetah.factor(composite).sigma0().isProbablePrime()) {
        return composite;
      }
    }
  }
}

