package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016311.
 * @author Sean A. Irvine
 */
public class A016311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016311() {
    super(new long[] {112, -86, 17}, new long[] {1, 17, 203});
  }
}
