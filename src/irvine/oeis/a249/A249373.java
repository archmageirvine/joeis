package irvine.oeis.a249;
// manually A249350/parmof2 at 2022-09-05 21:15

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A249373 Prime numbers Q such that the concatenation Q,d,Q is prime for at least one d in the set {1, 2, 3, 4, 5, 6, 7, 8, 9}.
 * @author Georg Fischer
 */
public class A249373 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final String primeStr = prime.toString();
      for (int middle = 1; middle <= 9; ++middle) {
        if (new Z(primeStr + middle + primeStr).isProbablePrime()) {
          return prime;
        }
      }
    }
  }
}
