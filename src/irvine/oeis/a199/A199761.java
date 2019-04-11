package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199761 <code>(9*11^n+1)/5</code>.
 * @author Sean A. Irvine
 */
public class A199761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199761() {
    super(new long[] {-11, 12}, new long[] {2, 20});
  }
}
