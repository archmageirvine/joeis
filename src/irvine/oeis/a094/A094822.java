package irvine.oeis.a094;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(3*x)/(1-3*x)^(1/3)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A094822 E.g.f.: exp(3x)/(1-3x)^(1/3).
 * @author Georg Fischer
 */
public class A094822 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A094822() {
    super(0, "[[0],[-9],[7,3],[-2,-1]]", "[1,4,19,118]", 2);
    setGfType(1);
  }
}
