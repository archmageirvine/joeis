package irvine.oeis.a086;

import irvine.oeis.PartialSumSequence;

/**
 * A086538 n-th partial sum of A086537.
 * @author Sean A. Irvine
 */
public class A086538 extends PartialSumSequence {

  /** Construct the sequence. */
  public A086538() {
    super(1, new A086537());
  }
}
