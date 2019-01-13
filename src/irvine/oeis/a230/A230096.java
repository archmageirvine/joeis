package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230096.
 * @author Sean A. Irvine
 */
public class A230096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230096() {
    super(new long[] {2, 0, 1, 0}, new long[] {1, 0, 0, 2});
  }
}
