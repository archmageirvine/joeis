package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224427 The Wiener index of the dendrimer NS[n], defined pictorially in the A. R. Ashrafi et al. reference.
 * @author Sean A. Irvine
 */
public class A224427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224427() {
    super(new long[] {-32, 64, -42, 11}, new long[] {343, 8967, 88679, 620839});
  }
}
