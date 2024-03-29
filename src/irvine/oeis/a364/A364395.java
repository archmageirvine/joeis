package irvine.oeis.a364;
// Generated by gen_seq4.pl holdfin/holos at 2023-08-09 21:46

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A364395 G.f. satisfies A(x) = 1 + x/A(x)*(1 + 1/A(x)^2).
 * @author Georg Fischer
 */
public class A364395 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A364395() {
    super(0, "[[0],[-11584645056,17294500464,-8881276256,1910232144,-147452320],[-64096241184,102640732152,-57811284672,13870483152,-1210215288],[-113870699784,204075466740,-131353563248,36244696704,-3634610596],[-2611845720,5732562282,-3973608972,968537688,-92166990],[0,-11154240,52543962,-60768549,10574469]]", "1,2,-8,60,-552,5648,-61712,705104", 0);
  }
}
