package irvine.oeis.a146;

import irvine.oeis.FilterSequence;
import irvine.oeis.a061.A061039;

/**
 * A146762 Terms of A061039 that are multiple of 10, in the order in which they appear.
 * @author Georg Fischer
 */
public class A146762 extends FilterSequence {

  /** Construct the sequence. */
  public A146762() {
    super(1, new A061039(), k -> k.mod(10) == 0);
  }
}
