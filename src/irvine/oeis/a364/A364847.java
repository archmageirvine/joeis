package irvine.oeis.a364;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364847 Number of conjugacy classes in the group SL(2, Z_n), up to conjugacy in GL(2, Z_n).
 * @author Gregory Morse
 */
public class A364847 extends LambdaSequence {

  /** Construct the sequence. */
  public A364847() {
    super(1, A364847::classes);
  }

  private static Z classes(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z result = Z.ONE;
    for (final Z p : fs.toZArray()) {
      // At scalar depth j, choose a scalar a with a^2 = 1 mod p^j.
      // The remaining cyclic part has free determinant and forced trace.
      final int e = fs.getExponent(p);
      Z count = p.pow(e);
      for (int j = 1; j <= e; ++j) {
        final int roots = Z.TWO.equals(p) && j != 2 ? (j == 1 ? 1 : 4) : 2;
        count = count.add(p.pow(e - j).multiply(roots));
      }
      result = result.multiply(count);
    }
    return result;
  }
}
