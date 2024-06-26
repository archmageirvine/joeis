package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-06-23/sintraf at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006519;
import irvine.oeis.a089.A089309;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A334173 Least i such that i-th term of Thue-Morse sequence (A010060) differs from (i + n)-th term.
 * @author Georg Fischer
 */
public class A334173 extends SingleTransformSequence {

  private static final DirectSequence A006519 = new A006519();

  /** Construct the sequence. */
  public A334173() {
    super(1, (term, n) -> Functions.THUE_MORSE.z(n).equals(Z.ONE) ? Z.ZERO : (term.testBit(0) ? A006519.a(n) : A006519.a(n).multiply(2)), new A089309());
  }
}
