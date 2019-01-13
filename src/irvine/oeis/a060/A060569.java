package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060569.
 * @author Sean A. Irvine
 */
public class A060569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060569() {
    super(new long[] {-1, 0, 6, 0}, new long[] {13, 17, 73, 97});
  }
}
