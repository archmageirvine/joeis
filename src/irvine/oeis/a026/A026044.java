package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026044.
 * @author Sean A. Irvine
 */
public class A026044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026044() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {22, 33, 49, 70, 97, 132});
  }
}
