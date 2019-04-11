package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199493 <code>2*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199493() {
    super(new long[] {-8, 9}, new long[] {3, 17});
  }
}
