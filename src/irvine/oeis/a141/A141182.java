package irvine.oeis.a141;
// manually pricongrm/pricongr at 2023-08-13 15:10

import irvine.math.z.Z;
import irvine.oeis.prime.CongruenceForm;

/**
 * A141182 Primes of the form x^2+6*x*y-2*y^2 (as well as of the form 5*x^2+8*x*y+y^2).
 * @author Georg Fischer
 */
public class A141182 extends CongruenceForm {

  /** Construct the sequence. */
  public A141182() {
    super(11, 0, 1, 3, 4, 5, 9);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.mod(Z.FOUR).equals(Z.ONE)) {
        return result;
      }
    }
  }
}
