package irvine.oeis.a194;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: -log(sqrt(1-x^2)-x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A194349 E.g.f.: -log( sqrt(1-x^2) - x ).
 * @author Georg Fischer
 */
public class A194349 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A194349() {
    super(1, "[[0],[0,0,8,4],[0],[-64,-96,-48,-8],[0],[224,184,52,5],[0],[-120,-74,-15,-1]]", "[1,2,5,24,129,960,7965,80640]", 6);
    setGfType(1);
  }
}
