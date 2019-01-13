package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262075.
 * @author Sean A. Irvine
 */
public class A262075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262075() {
    super(new long[] {1, -31, 31}, new long[] {105, 3248, 97433});
  }
}
