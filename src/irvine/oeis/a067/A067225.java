package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A067225 Numbers n such that n is a square and remains a square when its leading digit is increased by one.
 * @author Georg Fischer
 */
public class A067225 extends A000290 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z cand = super.next();
      final String str = cand.toString();
      char lead = str.charAt(0);
      ++lead;
      if (new Z((lead <= '9' ? String.valueOf(lead) : "10") + str.substring(1)).isSquare()) {
        return cand;
      }
    }
  }
}
