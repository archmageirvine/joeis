package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145122.
 * @author Sean A. Irvine
 */
public class A145122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145122() {
    super(new long[] {1, -303, 303}, new long[] {38, 14383, 4346478});
  }
}
