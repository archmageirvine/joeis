package irvine.oeis.a132;
// Generated by gen_seq4.pl holose at 2021-06-07 19:33
// 0: radtorec(1/3628800*(-1+1/(1-2*x)^(1/2))^10)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A132055 Tenth column of triangle A035342.
 * @author Georg Fischer
 */
public class A132055 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132055() {
    super(10, "[[0],[-12, 14,-4],[-22,-27, 4],[0, 10,-1]]", "1, 165, 16665, 1349205, 97026930, 6526750230, 423076603950, 26922666320550", 0);
    setGfType(1);
  }
}
