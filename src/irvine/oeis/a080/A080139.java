package irvine.oeis.a080;

import irvine.math.cr.CR;

/**
 * A080139 Least positive integer multiples of angle x such that their direction cosines form a unit vector: Sum_{k&gt;0} cos(a(k)*x)^2 = 1, where a(1)=1, a(n+1)&gt;a(n) and x=3-Pi/2.
 * @author Sean A. Irvine
 */
public class A080139 extends A080136 {

  /** Construct the sequence. */
  public A080139() {
    super(CR.THREE.subtract(CR.HALF_PI));
  }
}
