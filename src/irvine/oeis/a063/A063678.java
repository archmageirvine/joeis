package irvine.oeis.a063;

import irvine.oeis.DifferenceSequence;

/**
 * A063678 Arithmetic mean of largest subset of {A063676(1), ......., A063676(n-1)} such that a(n) is an integer and a(n) is maximal.
 * @author Sean A. Irvine
 */
public class A063678 extends DifferenceSequence {

  /** Construct the sequence. */
  public A063678() {
    super(new A063676());
  }
}
