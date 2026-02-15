package irvine.oeis.a393;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000219;

/**
 * A393239 Numbers k such that A000219(k) == 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A393239 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A393239() {
    super(1, 0, new A000219(), k -> k.mod(3) == 0);
  }
}
