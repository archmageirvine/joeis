package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199760 <code>(9*11^n+1)/10</code>.
 * @author Sean A. Irvine
 */
public class A199760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199760() {
    super(new long[] {-11, 12}, new long[] {1, 10});
  }
}
