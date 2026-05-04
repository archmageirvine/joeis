package irvine.oeis.a395;

import irvine.oeis.FilterSequence;
import irvine.oeis.a392.A392201;

/**
 * A395558 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A395558 extends FilterSequence {

  /** Construct the sequence. */
  public A395558() {
    super(1, new A392201(), PRIME);
  }
}
