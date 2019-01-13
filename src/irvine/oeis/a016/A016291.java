package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016291.
 * @author Sean A. Irvine
 */
public class A016291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016291() {
    super(new long[] {72, -62, 15}, new long[] {1, 15, 163});
  }
}
