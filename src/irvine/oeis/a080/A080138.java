package irvine.oeis.a080;

import irvine.math.cr.CR;

/**
 * A080138 Least positive integer multiples of angle x such that their direction cosines form a unit vector: sum(k&gt;0, cos(a(k)*x)^2)=1, where a(1)=1 and x=3.
 * @author Sean A. Irvine
 */
public class A080138 extends A080136 {

  /** Construct the sequence. */
  public A080138() {
    super(CR.THREE);
  }
}
