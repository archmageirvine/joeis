package irvine.oeis.a316;

import irvine.math.group.LinearGroupOrder;
import irvine.oeis.LambdaSequence;

/**
 * A316563 Maximum order of an element in the special linear group SL(2, Z(n)).
 * @author Gregory Morse
 */
public class A316563 extends LambdaSequence {

  /** Construct the sequence. */
  public A316563() {
    super(1, n -> LinearGroupOrder.maxOrder2(n, true));
  }
}
