package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132418.
 * @author Sean A. Irvine
 */
public class A132418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132418() {
    super(new long[] {43, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 10, 21});
  }
}
