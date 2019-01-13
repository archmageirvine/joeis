package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134019.
 * @author Sean A. Irvine
 */
public class A134019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134019() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 2, 4, 11});
  }
}
