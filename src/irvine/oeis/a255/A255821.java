package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255821 Numbers of words on {0,1,...,36} having no isolated zeros.
 * @author Sean A. Irvine
 */
public class A255821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255821() {
    super(new long[] {36, -36, 37}, new long[] {1, 36, 1297});
  }
}
