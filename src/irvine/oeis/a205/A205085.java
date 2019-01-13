package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205085.
 * @author Sean A. Irvine
 */
public class A205085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205085() {
    super(new long[] {-10, 11}, new long[] {11, 151});
  }
}
