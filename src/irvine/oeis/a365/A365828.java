package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000009;

/**
 * A365828 Number of strict integer partitions of 2n not containing n.
 * @author Georg Fischer
 */
public class A365828 extends LambdaSequence {

  private static final DirectSequence A000009 = new A000009();

  /** Construct the sequence. */
  public A365828() {
    super(0, n -> A000009.a(2 * n).subtract(A000009.a(n)).add(1));
  }
}
