package irvine.oeis.a182;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x)/(1+x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182386 a(0) = 1, a(n) = 1 - n * a(n-1).
 * @author Georg Fischer
 */
public class A182386 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182386() {
    super(0, "[[0],[-1],[1,1],[2,1]]", "[1,0,1,-2]", 2);
    setGfType(1);
  }
}
