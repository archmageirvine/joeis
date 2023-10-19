package irvine.oeis.a363;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001045;

/**
 * A250292.
 * @author Sean A. Irvine
 */
public class A363837 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A363837() {
    super(1, 0, new A001045(), SEMIPRIME);
  }
}
