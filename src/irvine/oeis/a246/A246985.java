package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246985.
 * @author Sean A. Irvine
 */
public class A246985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246985() {
    super(new long[] {36, -36, 11}, new long[] {1, 3, 11});
  }
}
