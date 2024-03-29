package irvine.oeis.a058;
// Generated by gen_seq4.pl etpsymm -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.a034.A034318;


/**
 * A058505 McKay-Thompson series of class 14a for Monster.
 * Somos formula: <code>T14a=symm(e14b,-7);; e14b=ecalc([1, 1;7,-1}],[2, 2]);</code>
 * @author Georg Fischer
 */
public class A058505 extends A034318 {

  /** Construct the sequence. */
  public A058505() {
    super(-1, 2, -7, 0, 0, -2, 0, -2, 0, -2, 0, -2, 0, -2, 0, -2, 0, 0);
  }
}
