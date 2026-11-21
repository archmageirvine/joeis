package irvine.oeis.a360;

import irvine.oeis.a003.A003991;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A360851 Array read by antidiagonals: T(m,n) is the number of induced paths in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A360851 extends PairTransformSequence {
  /** Construct the sequence. */
  public A360851() {
    super(1, new A360850(), new A003991(), (n, u, v) -> u.subtract(v));
  }
}
