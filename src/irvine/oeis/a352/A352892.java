package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-07-20/lambdan at 2024-07-20 00:09

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a341.A341515;
import irvine.oeis.a348.A348717;

/**
 * A352892 Next even term in the trajectory of map x -&gt; A341515(x), when starting from x=n; a(1) = 1. Here A341515 is the Collatz or 3x+1 map (A006370) conjugated by unary-binary-encoding (A156552).
 * @author Georg Fischer
 */
public class A352892 extends LambdaSequence {

  private static final DirectSequence A341515 = new A341515();
  private static final DirectSequence A348717 = new A348717();

  /** Construct the sequence. */
  public A352892() {
    super(1, n -> A348717.a(A341515.a(n)));
  }
}
