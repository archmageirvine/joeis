package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255821.
 * @author Sean A. Irvine
 */
public class A255821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255821() {
    super(new long[] {36, -36, 37}, new long[] {1, 36, 1297});
  }
}
