package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103325 Fifth powers of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A103325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103325() {
    super(new long[] {1, 8, -40, -60, 40, 8}, new long[] {32, 1, 243, 1024, 16807, 161051});
  }
}
