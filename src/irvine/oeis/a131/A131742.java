package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131742 <code>a(4n) = a(4n+1) = 0, a(4n+2) = 3n+1, a(4n+3) = 3n+2</code>.
 * @author Sean A. Irvine
 */
public class A131742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131742() {
    super(new long[] {-1, 1, -1, 1, 1, -1, 1}, new long[] {0, 0, 1, 2, 0, 0, 4});
  }
}
