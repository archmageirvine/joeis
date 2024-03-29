package irvine.oeis.a168;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+x-sqrt(1-10*x+25*x^2-12*x^3))/(6*x*(1-x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A168494 Sequence with Hankel transform equal to 3^floor(n^2/3).
 * @author Georg Fischer
 */
public class A168494 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A168494() {
    super(0, "[[0],[6,18,12],[106,69,-1],[-1502,-942,-136],[4584,2325,291],[-5498,-2322,-244],[2934,1047,93],[-686,-210,-16],[56,15,1]]", "[1,1,2,7,32,160,830,4405,23798]", 7);
  }
}
