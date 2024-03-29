package irvine.oeis.a058;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: log((1+1/sqrt(1-4*x))/2)/sqrt(1-4*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A058607 a(n) = (1 + 1/2 + 1/3 + ... + 1/n)*(2n-1)!/(n-1)!.
 * @author Georg Fischer
 */
public class A058607 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A058607() {
    super(1, "[[0],[12,32,16],[-18,-24,-8],[4,4,1]]", "[1,9,110,1750]", 2);
    setGfType(1);
  }
}
