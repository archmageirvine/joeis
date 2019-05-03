package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232601 <code>Sum[k=0..n] k^p*q^k</code> for <code>p=2,q=-2</code>.
 * @author Sean A. Irvine
 */
public class A232601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232601() {
    super(new long[] {8, 4, -6, -5}, new long[] {0, -2, 14, -58});
  }
}
