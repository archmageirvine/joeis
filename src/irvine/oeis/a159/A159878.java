package irvine.oeis.a159;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A159878 The digits of Pi whose spellings in English contain no i&apos;s. 
 * @author Georg Fischer
 */
public class A159878 extends A000796 {

  @Override
  public Z next() {
    Z result = super.next();
    while (result.compareTo(Z.FIVE) >= 0 && !result.equals(Z.SEVEN)) {
      result = super.next();
    }
    return result;
  }
}
