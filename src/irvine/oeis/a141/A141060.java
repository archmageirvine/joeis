package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141060 Fourth quadrisection of Jacobsthal numbers A001045: a(n)=16a(n-1)-5.
 * @author Sean A. Irvine
 */
public class A141060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141060() {
    super(new long[] {-16, 17}, new long[] {3, 43});
  }
}
