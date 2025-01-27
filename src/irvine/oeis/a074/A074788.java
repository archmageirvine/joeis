package irvine.oeis.a074;

import irvine.oeis.DistinctSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001608;

/**
 * A074767.
 * @author Sean A. Irvine
 */
public class A074788 extends FilterSequence {

  /** Construct the sequence. */
  public A074788() {
    super(1, new DistinctSequence(new A001608().skip()), PRIME);
  }
}
