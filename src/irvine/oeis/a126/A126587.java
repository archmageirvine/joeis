package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126587 <code>a(n) =</code> number of integer lattice points inside the right-angle triangle with legs <code>3n</code> and <code>4n (and</code> hypotenuse <code>5n)</code>.
 * @author Sean A. Irvine
 */
public class A126587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126587() {
    super(new long[] {1, -3, 3}, new long[] {3, 17, 43});
  }
}
