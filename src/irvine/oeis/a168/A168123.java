package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168123 n^2*(n^5+1)/2.
 * @author Sean A. Irvine
 */
public class A168123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168123() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 66, 1098, 8200, 39075, 139986, 411796});
  }
}
