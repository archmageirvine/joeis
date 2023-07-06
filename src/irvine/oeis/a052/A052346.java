package irvine.oeis.a052;

import irvine.oeis.InverseSequence;

/**
 * A052346 Smallest number which is the sum of two positive triangular numbers in exactly n different ways.
 * @author Sean A. Irvine
 */
public class A052346 extends InverseSequence {

  /** Construct the sequence. */
  public A052346() {
    super(0, new A052344().skip(1), 0);
  }
}
