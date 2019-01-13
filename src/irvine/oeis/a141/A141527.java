package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141527.
 * @author Sean A. Irvine
 */
public class A141527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141527() {
    super(new long[] {-41, -1}, new long[] {2, -1});
  }
}
