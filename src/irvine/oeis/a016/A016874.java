package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016874 <code>a(n) = (5*n + 2)^2</code>.
 * @author Sean A. Irvine
 */
public class A016874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016874() {
    super(new long[] {1, -3, 3}, new long[] {4, 49, 144});
  }
}
