package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120719.
 * @author Sean A. Irvine
 */
public class A120719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120719() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {0, 610, 1596, 16500, 97410});
  }
}
