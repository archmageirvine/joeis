package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199484 <code>(8*7^n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A199484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199484() {
    super(new long[] {-7, 8}, new long[] {3, 19});
  }
}
