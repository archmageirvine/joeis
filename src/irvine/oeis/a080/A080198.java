package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A080198 Least positive integer multiples of angle x such that their direction cosines form a unit vector: Sum_{k&gt;0} cos(a(k)*x)^2 = 1, where a(1)=1, a(n+1)&gt;a(n) and x=5/4.
 * @author Sean A. Irvine
 */
public class A080198 extends A080136 {

  /** Construct the sequence. */
  public A080198() {
    super(CR.valueOf(new Q(5, 4)));
  }
}
