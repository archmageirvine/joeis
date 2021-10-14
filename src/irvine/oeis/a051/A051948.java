package irvine.oeis.a051;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A051948 Numbers k such that k*sigma(k) == 2 (mod phi(k)).
 * @author Sean A. Irvine
 */
public class A051948 extends PrependSequence {

  /** Construct the sequence. */
  public A051948() {
    super(new SkipSequence(new A000040(), 8), 2, 3, 4, 5, 6, 7, 11, 13, 17, 19, 22);
  }
}
