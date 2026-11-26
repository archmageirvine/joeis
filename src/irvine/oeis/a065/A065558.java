package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A065558 Let G_n be the group of invertible 2 X 2 matrices mod n (sequence A000252). a(n) is the maximal degree of an irreducible representation of G_n.
 * @author Gregory Morse
 */
public class A065558 extends LambdaSequence {

  /** Construct the sequence. */
  public A065558() {
    super(1, A065558::degree);
  }

  private static Z degree(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z result = Z.ONE;
    for (final Z p : fs.toZArray()) {
      // Onn, Representations of automorphism groups of finite O-modules
      // of rank two, Theorem 1.4. Over F_2 there is no split principal series.
      final int e = fs.getExponent(p);
      result = result.multiply(e == 1 && Z.TWO.equals(p) ? Z.TWO : p.pow(e - 1).multiply(p.add(1)));
    }
    return result;
  }
}
