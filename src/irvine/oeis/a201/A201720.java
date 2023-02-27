package irvine.oeis.a201;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A201720 The total number of components in (A011800) of all labeled forests on n nodes whose components are all paths.
 * @author Georg Fischer
 */
public class A201720 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201720() {
    super(0, "[[0],[-90,153,-80,13],[170,-289,160,-29],[150,-204,52,6],[70,-38,-12],[6,6]]", "0,1,3,12", 0);
  }
}
