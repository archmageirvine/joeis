package irvine.oeis.a390;

import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A390952 Even Achilles numbers.
 * @author Sean A. Irvine
 */
public class A390952 extends FilterSequence {

  /** Construct the sequence. */
  public A390952() {
    super(1, new A052486(), EVEN);
  }
}
