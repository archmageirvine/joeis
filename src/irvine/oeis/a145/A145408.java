package irvine.oeis.a145;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A145408 Number of spanning trees with degrees 1 and 3 in O_6 X P_n.
 * Recurrence: a(n)=188*a(n-1)+7998*a(n-2)+259876*a(n-3)+4850072*a(n-4)+22611752*a(n-5)
 * @author Georg Fischer
 */
public class A145408 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A145408() {
    super(1, "[[0],[22611752],[4850072],[259876],[7998],[188],[-1]]", "24, 6048, 1431936, 326820576, 74610584016, 17042758679136, 3892782584508480, 889156265863827264, 203093678317841507424, 46388970280261506291456, 10595782951389630699006144", 0);
  }
}
