package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016778 a(n) = (3*n+1)^2.
 * @author Sean A. Irvine
 */
public class A016778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016778() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 49});
  }
}
