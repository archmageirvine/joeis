package irvine.oeis.a232;
// manually 2024-05-04/inverti at 2024-05-08

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000629;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A232974 Number of irreducible packed words of length n.
 * @author Georg Fischer
 */
public class A232974 extends PrependSequence {

  /** Construct the sequence. */
  public A232974() {
    super(new InverseInvertTransform(0, new A000629(), 1), 1);
  }
}
