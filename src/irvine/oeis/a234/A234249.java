package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234249.
 * @author Sean A. Irvine
 */
public class A234249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234249() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {15, 210, 1365, 5985, 20475, 58905, 148995, 341055, 720720});
  }
}
