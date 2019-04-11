package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016756 <code>a(n) = (2*n+1)^4</code>.
 * @author Sean A. Irvine
 */
public class A016756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016756() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 81, 625, 2401, 6561});
  }
}
