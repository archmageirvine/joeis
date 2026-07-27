package irvine.oeis.a179;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179580 Number of permutations of {1, ..., n+5} with deficiencies #{i : p(i) &lt; i} exceeding the exceedances #{i : p(i) &gt; i} by n or more.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A179580 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179580() {
    super(0, "[82,-437,914,-950,496,-104]", "[1,-8,26,-44,41,-20,4]");
  }
}

