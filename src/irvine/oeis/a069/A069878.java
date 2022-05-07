package irvine.oeis.a069;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a011.A011557;

/**
 * A069878 Number of partitions of 10^n into distinct parts.
 * @author Georg Fischer
 */
public class A069878 extends NestedSequence {

  /** Construct the sequence. */
  public A069878() {
    super(0, new A000009(), new A011557(), 0, 0);
  }

}
