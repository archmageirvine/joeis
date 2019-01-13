package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092181.
 * @author Sean A. Irvine
 */
public class A092181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092181() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 24, 153, 544, 1425});
  }
}
