package irvine.oeis.a224;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2-3*x-2*x^2+x*sqrt(1-4*x^2))/(2*(1-x-2*x^2-x^3))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A224747 Number of lattice paths from (0,0) to (n,0) that do not go below the x-axis and consist of steps U=(1,1), D=(1,-1) and H=(1,0), where H-steps are only allowed if y=1.
 * @author Georg Fischer
 */
public class A224747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A224747() {
    super(0, "[[0],[48,72,24],[-128,-24,20],[-448,-300,-38],[-100,-201,-53],[712,354,44],[260,132,16],[-380,-141,-13],[-56,-15,-1],[56,15,1]]", "[1,0,1,1,3,5,12,23,52,105]", 8);
  }
}
