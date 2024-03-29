package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067208 n is prime and remains prime when its leading digit is increased by one.
 * @author Georg Fischer
 */
public class A067208 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z cand = super.next();
      final String str = cand.toString();
      char lead = str.charAt(0);
      ++lead;
      if (new Z((lead <= '9' ? String.valueOf(lead) : "10") + str.substring(1)).isProbablePrime()) {
        return cand;
      }
    }
  }
}
