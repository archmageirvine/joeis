package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-06-26/sintraf at 2024-06-26 17:12

import irvine.math.z.Z;
import irvine.oeis.a264.A264977;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A283979 a(n) = (n XOR A264977(n))/4, where XOR is bitwise-xor (A003987).
 * @author Georg Fischer
 */
public class A283979 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A283979() {
    super(0, (term, n) -> (Z.valueOf(n).xor(term)).divide(4), new A264977());
  }
}
