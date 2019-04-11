package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016759 <code>a(n) = (2*n + 1)^7</code>.
 * @author Sean A. Irvine
 */
public class A016759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016759() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2187, 78125, 823543, 4782969, 19487171, 62748517, 170859375});
  }
}
