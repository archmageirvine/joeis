package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006577;
import irvine.oeis.a156.A156552;

/**
 * A352890 Number of iterations of map x -&gt; A341515(x) needed to reach x &lt;= 2 when starting from x=n, or -1 if such number is never reached. Here A341515 is the Collatz or 3x+1 map (A006370) conjugated by unary-binary-encoding (A156552).
 * @author Georg Fischer
 */
public class A352890 extends LambdaSequence {

  private static final DirectSequence A006577 = new A006577();
  private static final DirectSequence A156552 = new A156552();

  /** Construct the sequence. */
  public A352890() {
    super(1, n -> A006577.a(A156552.a(n)));
  }
}
