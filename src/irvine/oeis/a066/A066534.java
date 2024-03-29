package irvine.oeis.a066;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (x*exp(2*x))/(1-x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A066534 Total number of walks with length &gt; 0 in the Hasse diagram of a Boolean algebra of order n.
 * @author Georg Fischer
 */
public class A066534 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A066534() {
    super(0, "[[0],[-2],[3,1],[-1,-1]]", "[0,1,6,30]", 2);
    setGfType(1);
  }
}
