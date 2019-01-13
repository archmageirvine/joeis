package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145607.
 * @author Sean A. Irvine
 */
public class A145607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145607() {
    super(new long[] {1, -9, 9}, new long[] {0, 4, 35});
  }
}
