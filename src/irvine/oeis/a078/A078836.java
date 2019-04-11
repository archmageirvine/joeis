package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078836 <code>a(n) = n*2^(n-6)</code>.
 * @author Sean A. Irvine
 */
public class A078836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078836() {
    super(new long[] {-4, 4}, new long[] {6, 14});
  }
}
