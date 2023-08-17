package irvine.oeis.a125;
// manually robots/union2 at 2023-08-15 15:43

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A125854 Primes p with the property that p divides the Wolstenholme number A001008((p+1)/2).
 * @author Georg Fischer
 */
public class A125854 extends A000040 {

  @Override
  public Z next() {
    // primes p such that ((p-1)/2)^(p-1) == 1 (mod p^2)
    while (true) {
      final Z p = super.next();
      final Z pm1 = p.subtract(1);
      if (pm1.divide2().pow(pm1).mod(p.square()).equals(Z.ONE)) {
        return p;
      }
    }
  }
}
