package irvine.oeis.a276;

import irvine.oeis.PrependSequence;
import irvine.oeis.a089.A089910;

/**
 * A276885 Sums-complement of the Beatty sequence for 1 + phi.
 * @author Georg Fischer
 */
public class A276885 extends PrependSequence {

  /** Construct the sequence. */
  public A276885() {
    super(1, new A089910().skip(0), 1);
  }
}
