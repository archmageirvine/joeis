package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016850 <code>a(n) = (5n)^2</code>.
 * @author Sean A. Irvine
 */
public class A016850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016850() {
    super(new long[] {1, -3, 3}, new long[] {0, 25, 100});
  }
}
