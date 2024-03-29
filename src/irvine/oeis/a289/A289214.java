package irvine.oeis.a289;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((8*x)/(1-x))/(1-x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A289214 a(n) = n! * Laguerre(n,-8).
 * @author Georg Fischer
 */
public class A289214 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A289214() {
    super(0, "[[0],[1,1],[-11,-2],[2,1]]", "[1,9,98,1238]", 2);
    setGfType(1);
  }
}
