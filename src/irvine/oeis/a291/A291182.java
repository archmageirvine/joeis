package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291182.
 * @author Sean A. Irvine
 */
public class A291182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291182() {
    super(new long[] {-1, 7, -14, 7}, new long[] {3, 13, 52, 203});
  }
}
