package irvine.oeis.a074;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A074057 a(n) = 2*phi(n-2)-(n-1).
 * a(n)=2*eulerphi(n-1)-n
 * @author Georg Fischer
 */
public class A074057 extends LambdaSequence {

  /** Construct the sequence. */
  public A074057() {
    super(3, n -> Z.TWO.multiply(Functions.PHI.l(n - 2)).subtract(n - 1));
  }
}
