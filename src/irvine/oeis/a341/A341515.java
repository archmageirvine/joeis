package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a006.A006370;
import irvine.oeis.a156.A156552;

/**
 * A341515 The Collatz or 3x+1 map (A006370) conjugated by unary-binary-encoding (A156552).
 * @author Georg Fischer
 */
public class A341515 extends LambdaSequence {

  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A006370 = new A006370();
  private static final DirectSequence A156552 = new A156552();

  /** Construct the sequence. */
  public A341515() {
    super(1, n -> A005940.a(A006370.a(A156552.a(n)).add(1)));
  }
}
