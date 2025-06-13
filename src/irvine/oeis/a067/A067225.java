package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A067225 Numbers k such that k is a square and remains a square when its leading digit is increased by one.
 * @author Georg Fischer
 */
public class A067225 extends A000290 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z cand = super.next();
      final String str = cand.toString();
      final char lead = (char) (str.charAt(0) + 1);
      if (new Z((lead <= '9' ? String.valueOf(lead) : "10") + str.substring(1)).isSquare()) {
        return cand;
      }
    }
  }
}
