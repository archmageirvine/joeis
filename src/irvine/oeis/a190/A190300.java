package irvine.oeis.a190;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001248;

/**
 * A190300 Composite numbers that are not Brazilian.
 * @author Georg Fischer
 */
public class A190300 extends PrependSequence {

  /** Construct the sequence. */
  public A190300() {
    super(5, new A001248(), 4, 6, 9, 25, 49);
  }
}
