package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050408.
 * @author Sean A. Irvine
 */
public class A050408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050408() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 136});
  }
}
