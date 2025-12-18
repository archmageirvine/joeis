package irvine.oeis.a390;

import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A390953 Odd Achilles numbers.
 * @author Sean A. Irvine
 */
public class A390953 extends FilterSequence {

  /** Construct the sequence. */
  public A390953() {
    super(1, new A052486(), ODD);
  }
}
