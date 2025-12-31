package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000265;

/**
 * A082908 Largest value of gcd(2^n, binomial(n,j)) with j=0..n-1; maximum value of largest power of 2 dividing binomial(n,j) in the n-th row of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A082908 extends Sequence0 {

  private final Sequence mA = new A000265();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(Functions.DIGIT_LENGTH.l(2, mA.next()) - 1);
  }
}
