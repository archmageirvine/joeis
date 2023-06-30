package irvine.oeis.a308;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a073.A073053;

/**
 * A308106 Distinct values taken by the DENEAT operator (A073053) in order of appearance.
 * @author Georg Fischer
 */
public class A308106 extends DistinctSequence {

  /** Construct the sequence. */
  public A308106() {
    super(1, new A073053());
  }

}

