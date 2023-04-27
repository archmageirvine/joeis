package irvine.oeis.a063;

import irvine.oeis.a006.A006960;

/**
 * A063049 Integers n &gt; 196 such that the 'Reverse and Add!' trajectory of n joins the trajectory of 196.
 * @author Sean A. Irvine
 */
public class A063049 extends A063055 {

  /** Construct the sequence. */
  public A063049() {
    super(new A006960(), 294);
    setOffset(1);
  }
}
