package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161852 Solutions to the simultaneous equations <code>m(n)+1=a(n)^2</code> and <code>7*m(n)+1=b(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A161852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161852() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 5, 11, 79});
  }
}
