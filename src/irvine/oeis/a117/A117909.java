package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117909 Count, inserting 0 after every even number.
 * @author Sean A. Irvine
 */
public class A117909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117909() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 0, 3, 4, 0});
  }
}
