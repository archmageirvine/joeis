package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123228.
 * @author Sean A. Irvine
 */
public class A123228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123228() {
    super(new long[] {-1, -13, -74, -74, -13}, new long[] {6, -14, 22, 466, -6714});
  }
}
