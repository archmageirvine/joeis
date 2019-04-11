package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016923 <code>a(n) = (6*n + 1)^3</code>.
 * @author Sean A. Irvine
 */
public class A016923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016923() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 343, 2197, 6859});
  }
}
