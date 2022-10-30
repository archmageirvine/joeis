package irvine.oeis.a045;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002375;

/**
 * A045922 Partial sums of Goldbach numbers A002375.
 * @author Sean A. Irvine
 */
public class A045922 extends PartialSumSequence {

  /** Construct the sequence. */
  public A045922() {
    super(1, new A002375());
  }
}
