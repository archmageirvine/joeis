package irvine.oeis.a036;

import irvine.oeis.PrependSequence;

/**
 * A036251 Number of trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A036251 extends PrependSequence {

  /** Construct the sequence. */
  public A036251() {
    super(new A036250().skip(3), 1, 2, 3);
  }
}

