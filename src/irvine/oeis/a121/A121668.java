package irvine.oeis.a121;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A121668 Products of consecutive Apery numbers, cf. A006221.
 * @author Georg Fischer
 */
public class A121668 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A121668() {
    super(1, "[[0],[40,-84,-222,673,159,-1998,1587,1806,-4293,3566,-1557,357,-34],[-2920,14532,-4314,-94756,152730,165960,-607267,268104,784371,-1309935,888750,-294525,39270],[0,0,0,-2925,5775,21798,-49739,-55998,169269,18090,-240795,176715,-39270],[0,0,0,0,0,0,-117,-120,189,151,-126,-51,34]]", "5,365,105485,47686445", 1);
  }
}
