package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072257 <code>((6n-17)*4^n-1)/3</code>.
 * @author Sean A. Irvine
 */
public class A072257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072257() {
    super(new long[] {16, -24, 9}, new long[] {-6, -15, -27});
  }
}
