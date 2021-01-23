package irvine.oeis.a036;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A036251 Number of trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A036251 extends PrependSequence {

  /** Construct the sequence. */
  public A036251() {
    super(new SkipSequence(new A036250(), 3), 1, 2, 3);
  }
}

