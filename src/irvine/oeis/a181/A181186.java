package irvine.oeis.a181;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A181186 Number of prime factors of (2^n - 1) * n! + 1, counted with multiplicity.
 * a(n)=bigomega((2^n-1)*n!+1)
 * @author Georg Fischer
 */
public class A181186 extends LambdaSequence {

  /** Construct the sequence. */
  public A181186() {
    super(1, n -> Functions.BIG_OMEGA.z(Z.ONE.shiftLeft(n).subtract(Z.ONE).multiply(Functions.FACTORIAL.z(n)).add(Z.ONE)));
  }
}
