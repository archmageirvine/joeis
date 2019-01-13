package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016215.
 * @author Sean A. Irvine
 */
public class A016215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016215() {
    super(new long[] {30, -43, 14}, new long[] {1, 14, 153});
  }
}
