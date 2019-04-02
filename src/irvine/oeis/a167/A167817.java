package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167817 Period 4: repeat [1, 3, 3, 3].
 * @author Sean A. Irvine
 */
public class A167817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167817() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 3, 3, 3});
  }
}
