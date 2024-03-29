package irvine.oeis.a079;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt(2)*sqrt(1+sqrt(1-16*x))-sqrt(1-16*x)-1)/(4*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A079489 Series reversion of x(1-x^2)/(1+x^2)^2 expanded in odd powers of x.
 * @author Georg Fischer
 */
public class A079489 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A079489() {
    super(0, "[[0],[240,992,1280,512],[-300,-534,-320,-64],[30,37,15,2]]", "[1,3,22,211]", 2);
  }
}
