package irvine.oeis.a059;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-sqrt(1-(4*x*(1-x))/(1-2*x)))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A059279 G.f. is ((1-x)/(1-2*x)) * G(x*(1-x)/(1-2*x)) where G(x) is g.f. for Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A059279 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A059279() {
    super(0, "[[0],[8,24,16],[-128,-160,-48],[408,304,56],[-488,-258,-34],[220,94,10],[-30,-11,-1]]", "[1,2,6,20,72,276,1112]", 5);
  }
}
