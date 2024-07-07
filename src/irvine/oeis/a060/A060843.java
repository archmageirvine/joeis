package irvine.oeis.a060;

import irvine.oeis.NoncomputableSequence;

/**
 * A060843 Busy Beaver problem: a(n) is the maximal number of steps that an n-state Turing machine can make on an initially blank tape before eventually halting.
 * @author Sean A. Irvine
 */
public class A060843 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A060843() {
    super(1, NONCOMPUTABLE, 1, 6, 21, 107, 47176870);
  }
}
