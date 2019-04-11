package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016852 <code>(5n)^4</code>.
 * @author Sean A. Irvine
 */
public class A016852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016852() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 625, 10000, 50625, 160000});
  }
}
