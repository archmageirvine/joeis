package irvine.oeis.a316;

import irvine.math.group.LinearGroupOrder;
import irvine.oeis.LambdaSequence;

/**
 * A316565 Maximum order of an element of the general linear group GL(2, Z(n)).
 * @author Gregory Morse
 */
public class A316565 extends LambdaSequence {

  /** Construct the sequence. */
  public A316565() {
    super(1, n -> LinearGroupOrder.maxOrder2(n, false));
  }
}
