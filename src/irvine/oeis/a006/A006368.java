package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006368 The "amusical permutation" of the nonnegative numbers: <code>a(2n)=3n, a(4n+1)=3n+1, a(4n-1)=3n-1</code>.
 * @author Sean A. Irvine
 */
public class A006368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006368() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 3, 2, 6, 4});
  }
}

