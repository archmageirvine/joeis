package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067227 n is prime and remains prime when its leading digit is replaced by each of 2, 4 and 8.
 * @author Georg Fischer
 */
public class A067227 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z cand = super.next();
      final String rest = cand.toString().substring(1);
      if (new Z("2" + rest).isProbablePrime() && new Z("4" + rest).isProbablePrime() && new Z("8" + rest).isProbablePrime()) {
        return cand;
      }
    }
  }
}
