package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189356 <code>a(n)</code> gives y-values solving the Diophantine equation <code>2*x^2 + (x-1)^2 = y^2</code> for positive x.
 * @author Sean A. Irvine
 */
public class A189356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189356() {
    super(new long[] {-1, 14}, new long[] {3, 41});
  }
}
