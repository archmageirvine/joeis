package irvine.oeis.a087;

import irvine.oeis.DistinctSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a020.A020882;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A087456 extends DistinctSequence {

  /** Construct the sequence. */
  public A087456() {
    super(1, new FilterSequence(new A020882(), FilterSequence.PALINDROME));
  }
}
