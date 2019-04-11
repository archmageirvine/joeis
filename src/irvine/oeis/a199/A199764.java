package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199764 <code>10*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199764() {
    super(new long[] {-11, 12}, new long[] {11, 111});
  }
}
