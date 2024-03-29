package irvine.oeis.a177;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1+2*x)^(1/4)/(1-2*x)^(3/4)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177373 a(n) = 2*n*a(n-1) if the parity of the ratio a(n-1)/a(n-2) is odd, otherwise (for even parity) a(n) = (2n-1)*a(n-1).
 * @author Georg Fischer
 */
public class A177373 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177373() {
    super(0, "[[0],[2,4],[2],[-2,-1]]", "[1,2,6,36]", 2);
    setGfType(1);
  }
}
