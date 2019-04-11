package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016742 Even squares: <code>a(n) = (2n)^2</code>.
 * @author Sean A. Irvine
 */
public class A016742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016742() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 16});
  }
}
