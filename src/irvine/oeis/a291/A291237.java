package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291237.
 * @author Sean A. Irvine
 */
public class A291237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291237() {
    super(new long[] {1, 7, 11, -6, -11, 7}, new long[] {7, 35, 162, 721, 3139, 13504});
  }
}
