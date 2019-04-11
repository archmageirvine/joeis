package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141722 <code>a(n) = 8*4^n - 7</code>.
 * @author Sean A. Irvine
 */
public class A141722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141722() {
    super(new long[] {-4, 5}, new long[] {1, 25});
  }
}
