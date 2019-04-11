package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199762 <code>(9*11^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199762() {
    super(new long[] {-11, 12}, new long[] {5, 50});
  }
}
