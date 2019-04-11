package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193578 <code>(13^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A193578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193578() {
    super(new long[] {-13, 14}, new long[] {1, 7});
  }
}
