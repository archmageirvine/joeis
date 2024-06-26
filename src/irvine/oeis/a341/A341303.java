package irvine.oeis.a341;
// Generated by gen_seq4.pl simple/simbinom at 2023-03-20 18:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A341303 a(n) = n!-6*Catalan(n)+5*2^n+4*binomial(n,2)-2*Fibonacci(n)-14*n+20.
 * @author Georg Fischer
 */
public class A341303 extends AbstractSequence {

  private int mN = 2;

  /** Construct the sequence. */
  public A341303() {
    super(3);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(mN).subtract(Functions.CATALAN.z(mN).multiply(6)).add(Z.ONE.shiftLeft(mN).multiply(5)).add(Binomial.binomial(mN, 2).multiply(4)).subtract(Functions.FIBONACCI.z(mN).multiply2()).add(Z.valueOf(-14L * mN + 20));
  }
}
