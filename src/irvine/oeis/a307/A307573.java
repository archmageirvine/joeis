package irvine.oeis.a307;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (-2*x^2-sqrt((1-x^2)*(1-4*x+3*x^2))+sqrt((1+x^2)*(1-4*x+5*x^2)))/(4*x^2*(1-x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307573 Number of Motzkin excursions of length n with an odd number of humps.
 * @author Georg Fischer
 */
public class A307573 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307573() {
    super(0, "[[0],[360,660,360,60],[-1740,-2038,-780,-98],[3162,2863,834,77],[-23682,-13120,-2358,-140],[52725,23770,3348,143],[-53031,-19148,-2016,-52],[22395,5388,180,-18],[51867,21220,2868,128],[-130113,-45386,-5256,-202],[127287,40554,4284,150],[-63849,-18787,-1830,-59],[16299,4452,402,12],[-1680,-428,-36,-1]]", "[0,0,1,3,7,15,32,70,161,393,1012,2706,7392,20384]", 12);
  }
}
