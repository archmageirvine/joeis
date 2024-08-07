package irvine.oeis.a329;
// Generated by gen_seq4.pl 2024-07-20/lambdan at 2024-07-20 00:09

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a051.A051903;
import irvine.oeis.a324.A324886;

/**
 * A329344 Number of times most frequent primorial is present in the greedy sum of primorials adding to A108951(n).
 * @author Georg Fischer
 */
public class A329344 extends LambdaSequence {

  private static final DirectSequence A051903 = new A051903();
  private static final DirectSequence A324886 = new A324886();

  /** Construct the sequence. */
  public A329344() {
    super(1, n -> A051903.a(A324886.a(n)));
  }
}
