package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016828 <code>a(n) = (4*n+2)^4</code>.
 * @author Sean A. Irvine
 */
public class A016828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016828() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 1296, 10000, 38416, 104976});
  }
}
