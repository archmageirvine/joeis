package irvine.oeis.a052;

import irvine.oeis.InverseSequence;
import irvine.oeis.SkipSequence;

/**
 * A052346 Smallest number which is the sum of two positive triangular numbers in exactly n different ways.
 * @author Sean A. Irvine
 */
public class A052346 extends InverseSequence {

  /** Construct the sequence. */
  public A052346() {
    super(0, new SkipSequence(new A052344(), 1), 0);
  }
}
