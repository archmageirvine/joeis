package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284703.
 * @author Sean A. Irvine
 */
public class A284703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284703() {
    super(new long[] {-1, -1, 1, 2, -1, 1, 2, 1}, new long[] {1, 5, 10, 17, 51, 98, 211, 457});
  }
}
