package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020595 Expansion of 1/((1-6x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A020595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020595() {
    super(new long[] {540, -204, 25}, new long[] {1, 25, 421});
  }
}
