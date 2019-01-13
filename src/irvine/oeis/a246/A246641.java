package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246641.
 * @author Sean A. Irvine
 */
public class A246641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246641() {
    super(new long[] {1, -19, 19}, new long[] {1, 9, 153});
  }
}
