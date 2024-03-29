package irvine.oeis.a058;
// Generated by gen_seq4.pl etpsymm 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.a034.A034318;


/**
 * A058483 McKay-Thompson series of class 12E for the Monster group.
 * Somos formula: <code>T12E=symm(e12I1,-3);; e12I1=ecalc([2, 2;3, 1;1,-1;6,-2}],[2, 2]);</code>
 * @author Georg Fischer
 */
public class A058483 extends A034318 {

  /** Construct the sequence. */
  public A058483() {
    super(0, 2, -3, 0, 0, 2, 0, -2, 0, 0, 0, -2, 0, 2, 0, 0);
  }
}
