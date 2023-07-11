package irvine.oeis.a048;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a045.A045948;

/**
 * A048148 Distinct elements of A045948.
 * @author Sean A. Irvine
 */
public class A048148 extends DistinctSequence {

  /** Construct the sequence. */
  public A048148() {
    super(1, new A045948());
  }
}

