package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179238 Numerators in convergents to infinitely repeating period 3 palindromic continued fraction <code>[1,2,1,...]</code>.
 * @author Sean A. Irvine
 */
public class A179238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179238() {
    super(new long[] {1, 0, 0, 6, 0, 0}, new long[] {1, 2, 3, 5, 13, 18});
  }
}
