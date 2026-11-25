package irvine.oeis.a327;

import irvine.math.group.LinearGroupOrder;
import irvine.oeis.LambdaSequence;

/**
 * A327568 Exponent of the group GL(2, Z_n).
 * @author Gregory Morse
 */
public class A327568 extends LambdaSequence {

  /** Construct the sequence. */
  public A327568() {
    super(1, n -> LinearGroupOrder.exponent2(n, false));
  }
}
