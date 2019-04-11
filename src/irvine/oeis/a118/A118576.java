package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118576 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+16807)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A118576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118576() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 2145, 3773, 6468, 8540, 12005, 19208, 24521, 28665, 35672, 41148, 50421, 61388, 69972, 84525, 95921, 115248, 156065, 186480, 210308, 250733, 282405, 336140});
  }
}
