package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A080140 Least positive integer multiples of angle x such that their direction cosines form a unit vector: Sum_{k&gt;0} cos(a(k)*x)^2 = 1, where a(1)=1 and x=2/3.
 * @author Sean A. Irvine
 */
public class A080140 extends A080136 {

  /** Construct the sequence. */
  public A080140() {
    super(CR.valueOf(new Q(2, 3)));
  }
}
