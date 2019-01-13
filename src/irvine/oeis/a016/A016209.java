package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016209.
 * @author Sean A. Irvine
 */
public class A016209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016209() {
    super(new long[] {15, -23, 9}, new long[] {1, 9, 58});
  }
}
