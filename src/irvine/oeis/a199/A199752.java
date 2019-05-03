package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199752 <code>3*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199752() {
    super(new long[] {-11, 12}, new long[] {4, 34});
  }
}
