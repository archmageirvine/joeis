package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221010.
 * @author Sean A. Irvine
 */
public class A221010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221010() {
    super(new long[] {-32, 64, -42, 11}, new long[] {84, 2328, 23070, 161322});
  }
}
