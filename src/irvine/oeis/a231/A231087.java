package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231087.
 * @author Sean A. Irvine
 */
public class A231087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231087() {
    super(new long[] {1, -6, 6}, new long[] {50, 224, 1058});
  }
}
