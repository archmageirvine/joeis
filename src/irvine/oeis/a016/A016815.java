package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016815 (4n+1)^3.
 * @author Sean A. Irvine
 */
public class A016815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016815() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 125, 729, 2197});
  }
}
