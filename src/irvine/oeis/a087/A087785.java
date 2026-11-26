package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.LinearGroupOrder;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A087785 Number of elements in GL(2,Z_n) x with x^2 == -I mod n where I is the identity matrix.
 * @author Gregory Morse
 */
public class A087785 extends LambdaSequence {

  /** Construct the sequence. */
  public A087785() {
    super(1, A087785::roots);
  }

  private static Z roots(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z result = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final boolean even = Z.TWO.equals(p);
      final boolean split = Z.ONE.equals(p.mod(Z.FOUR));
      // Nonscalar reductions are cyclic with characteristic polynomial x^2+1.
      // Their centralizer is the unit group of the corresponding quadratic algebra.
      final Z centralizer = even ? Z.TWO : split ? p.subtract(1).square() : p.square().subtract(1);
      final int scalars = even ? (e == 1 ? 1 : 0) : split ? 2 : 0;
      result = result.multiply(LinearGroupOrder.general(2, p).divide(centralizer).multiply(p.pow(2L * (e - 1))).add(scalars));
    }
    return result;
  }
}
