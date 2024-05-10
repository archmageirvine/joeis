package irvine.oeis.a068;

import irvine.oeis.a066.A066425;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A068056 Sums of all subsets of A066425.
 * @author Sean A. Irvine
 */
public class A068056 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A068056() {
    super(new A066425());
  }

  {
    setOffset(0);
  }

}

