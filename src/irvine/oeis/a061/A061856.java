package irvine.oeis.a061;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a014.A014486;

/**
 * A061856 The positions of the terms of A061855 in the sequence A014486, terms fixed by the permutation A057164.
 * @author Sean A. Irvine
 */
public class A061856 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061856() {
    super(0, 0, new A014486(), A061855::is);
  }
}
