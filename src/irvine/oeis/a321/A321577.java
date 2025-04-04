package irvine.oeis.a321;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a112.A112987;

/**
 * A321577 a(n) = F_n mod M_n, where F_n = 2^(2^n) + 1 and M_n = 2^n - 1.
 * @author Georg Fischer
 */
public class A321577 extends LambdaSequence {

  private static final DirectSequence A112987 = new A112987();

  /** Construct the sequence. */
  public A321577() {
    super(1, n -> (n <= 2) ? Z.valueOf(2L * n - 2) : A112987.a(n).add(1));
  }
}
