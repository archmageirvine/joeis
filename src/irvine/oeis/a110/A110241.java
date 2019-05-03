package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110241 <code>J(n)^3+J(n+1)^3</code>, where <code>J(n) =</code> the Jacobsthal number <code>A001045(n)</code>.
 * @author Sean A. Irvine
 */
public class A110241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110241() {
    super(new long[] {-64, 24, 6}, new long[] {1, 2, 28});
  }
}
