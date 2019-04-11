package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141725 <code>a(n) = 4^(n+1) - 3</code>.
 * @author Sean A. Irvine
 */
public class A141725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141725() {
    super(new long[] {-4, 5}, new long[] {1, 13});
  }
}
