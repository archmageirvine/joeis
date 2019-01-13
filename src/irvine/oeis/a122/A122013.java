package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122013.
 * @author Sean A. Irvine
 */
public class A122013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122013() {
    super(new long[] {-1, 0, 7, 0, -13, 0, 7, 0}, new long[] {1, 8, 27, 49, 122, 241, 530, 1101});
  }
}
