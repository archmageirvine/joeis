package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145404.
 * @author Sean A. Irvine
 */
public class A145404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145404() {
    super(new long[] {1, 12, -47, -8, 47, 12}, new long[] {8, 137, 2016, 30521, 459544, 6926545});
  }
}
