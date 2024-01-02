package irvine.oeis.a135;
// manually holon at 2023-12-26 21:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A135334 Number of Dyck paths of semilength n having no UDDU's starting at level 1.
 * 1+1/4/x*(1-(1-4*x)^(1/2))/(5/4-1/4*(1-4*x)^(1/2))
 * @author Georg Fischer
 */
public class A135334 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135334() {
    super(0, "[[0],[840,-380,40],[-2160,1074,-126],[2724,-1489,197],[-1128,842,-154],[168,-224,76],[0,20,-28],[0,4,4]]", "1", 0, OGF);
  }
}
