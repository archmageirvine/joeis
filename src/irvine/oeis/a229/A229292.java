package irvine.oeis.a229;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A229292 Exponent of the product of GL(2,GF(p^e)) over the prime powers p^e in n.
 * @author Gregory Morse
 */
public class A229292 extends LambdaSequence {

  private static Z exponent(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z lcm = Z.ONE;
    for (final Z p : fs.toZArray()) {
      lcm = lcm.lcm(p.multiply(p.pow(2L * fs.getExponent(p)).subtract(1)));
    }
    return lcm;
  }

  /** Construct the sequence. */
  public A229292() {
    super(1, A229292::exponent);
  }
}
