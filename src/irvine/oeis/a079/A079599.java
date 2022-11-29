package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a034.A034798;

/**
 * A079599 Numbers n for which the n-th impartial game is a second player win.
 * @author Georg Fischer
 */
public class A079599 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079599() {
    super(0, 0, new A034798(), Z.ZERO);
  }
}
