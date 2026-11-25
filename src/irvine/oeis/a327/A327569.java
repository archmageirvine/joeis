package irvine.oeis.a327;

import irvine.math.group.LinearGroupOrder;
import irvine.oeis.LambdaSequence;

/**
 * A327569 Exponent of the group SL(2, Z_n).
 * @author Gregory Morse
 */
public class A327569 extends LambdaSequence {

  /** Construct the sequence. */
  public A327569() {
    super(1, n -> LinearGroupOrder.exponent2(n, true));
  }
}
