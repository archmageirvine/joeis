package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016278.
 * @author Sean A. Irvine
 */
public class A016278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016278() {
    super(new long[] {54, -51, 14}, new long[] {1, 14, 145});
  }
}
