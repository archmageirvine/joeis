package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199106 <code>4*12^n-1</code>.
 * @author Sean A. Irvine
 */
public class A199106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199106() {
    super(new long[] {-12, 13}, new long[] {3, 47});
  }
}
