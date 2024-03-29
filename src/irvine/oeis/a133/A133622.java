package irvine.oeis.a133;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x)-1+(x*sinh(x))/2
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A133622 a(n) = 1 if n is odd, a(n) = n/2+1 if n is even.
 * @author Georg Fischer
 */
public class A133622 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133622() {
    super(1, "[[0],[0,1],[-3,-4,-1],[8,10,1,-1],[6,17,17,7,1],[-48,-100,-70,-20,-2]]", "[1,2,1,3,1,4]", 4);
    setGfType(1);
  }
}
