package irvine.oeis.a048;

import irvine.oeis.SkipSequence;
import irvine.oeis.a122.A122254;

/**
 * A048135 Tomahawk-constructible n-gons.
 * @author Sean A. Irvine
 */
public class A048135 extends SkipSequence {

  /** Construct the sequence. */
  public A048135() {
    super(1, new A122254(), 2);
  }
}
