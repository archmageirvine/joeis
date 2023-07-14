package irvine.oeis.a146;

import irvine.oeis.FilterSequence;
import irvine.oeis.a061.A061047;

/**
 * A146950 Terms of A061047 ending in 0.
 * @author Georg Fischer
 */
public class A146950 extends FilterSequence {

  /** Construct the sequence. */
  public A146950() {
    super(1, new A061047(), k -> k.mod(10) == 0);
  }
}
