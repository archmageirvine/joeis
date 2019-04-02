package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224428 The hyper-Wiener index of the dendrimer NS[n], defined pictorially in the A. R. Ashrafi et al. reference.
 * @author Sean A. Irvine
 */
public class A224428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224428() {
    super(new long[] {128, -288, 232, -86, 15}, new long[] {1032, 54472, 853256, 8392840, 64852872});
  }
}
