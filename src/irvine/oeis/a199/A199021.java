package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199021 <code>(5*11^n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199021() {
    super(new long[] {-11, 12}, new long[] {2, 27});
  }
}
