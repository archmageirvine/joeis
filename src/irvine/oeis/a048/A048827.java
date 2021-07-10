package irvine.oeis.a048;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a047.A047988;

/**
 * A048827 a(n) = least k such that A047988(k) = n.
 * @author Sean A. Irvine
 */
public class A048827 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A048827() {
    super(new A047988(), 0, 2);
  }
}
