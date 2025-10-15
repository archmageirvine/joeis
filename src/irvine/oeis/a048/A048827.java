package irvine.oeis.a048;

import irvine.oeis.InverseSequence;
import irvine.oeis.a047.A047988;

/**
 * A048827 a(n) = least k such that A047988(k) = n.
 * @author Sean A. Irvine
 */
public class A048827 extends InverseSequence {

  /** Construct the sequence. */
  public A048827() {
    super(0, 0, new A047988(), 2);
  }
}
