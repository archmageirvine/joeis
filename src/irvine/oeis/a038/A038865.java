package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038865.
 * @author Sean A. Irvine
 */
public class A038865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038865() {
    super(new long[] {1, -3, 3}, new long[] {63, 117, 189});
  }
}
