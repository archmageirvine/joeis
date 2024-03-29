package irvine.oeis.a262;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (exp(x^2)*(x+1)-(x^4/2+x^2+x+1))/x^3
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A262034 Number of permutations of [n] beginning with at least ceiling(n/2) ascents.
 * @author Georg Fischer
 */
public class A262034 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262034() {
    super(0, "[[0],[4,-4],[0,-4],[-14,4,2],[-40,4,2],[-58,-3,1],[140,48,4],[324,90,6]]", "[1,0,1,1,4,5,30,42]", 6);
    setGfType(1);
  }
}
