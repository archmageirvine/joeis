package irvine.oeis.a178;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A178747 Sum of terms in 'rows' of A178746.
 * a(n) = (17*4^n + 5*(2*(-1)^n-1)*2^n - 7*(-1)^n)/15
 * @author Georg Fischer
 */
public class A178747 extends LambdaSequence {

  /** Construct the sequence. */
  public A178747() {
    super(0, n -> (Z.valueOf(17)).multiply(Z.FOUR.pow(n)).add(Z.FIVE.multiply((Z.TWO).multiply(Z.NEG_ONE.pow(n)).subtract(Z.ONE)).multiply(Z.ONE.shiftLeft(n))).subtract(Z.SEVEN.multiply(Z.NEG_ONE.pow(n))).divide(Z.valueOf(15)));
  }
}
