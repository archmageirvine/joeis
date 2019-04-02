package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216122 The Wiener index of the nanostar dendrimer NS[n], defined pictorially in the Ashrafi et al. reference.
 * @author Sean A. Irvine
 */
public class A216122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216122() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {94698, 1317858, 10315218, 63835698, 349594098});
  }
}
