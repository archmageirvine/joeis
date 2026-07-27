package irvine.oeis.a179;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179581 Number of permutations of {1, ..., n+6} with deficiencies #{i : p(i) &lt; i} exceeding exceedances #{i : p(i) &gt; i} by n or more.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A179581 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179581() {
    super(0, "[500,-5177,23073,-57986,90106,-88830,54308,-18824,2832]", "[1,-14,85,-294,639,-906,839,-490,164,-24]");
  }
}

