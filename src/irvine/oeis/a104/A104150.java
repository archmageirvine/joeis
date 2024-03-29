package irvine.oeis.a104;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: -log(1-x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104150 Shifted factorial numbers: a(0)=0, a(n) = (n-1)!.
 * @author Georg Fischer
 */
public class A104150 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A104150() {
    super(0, "[[0],[0],[1,1],[-2,-1]]", "[0,1,1,2]", 2);
    setGfType(1);
  }
}
