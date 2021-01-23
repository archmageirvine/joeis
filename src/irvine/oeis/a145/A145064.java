package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145064 Reduced numerators of the first convergent to the cube root of n using the recursion x = (2*x+n/x^2)/3.
 * @author Sean A. Irvine
 */
public class A145064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145064() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {2, 1, 4, 5, 2, 7});
  }
}
