package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246059 <code>(17*10^n-8)/9</code>.
 * @author Sean A. Irvine
 */
public class A246059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246059() {
    super(new long[] {-10, 11}, new long[] {1, 18});
  }
}
