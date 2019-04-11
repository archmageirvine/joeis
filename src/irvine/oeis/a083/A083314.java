package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083314 <code>(2*4^n-(3^n-1))/2</code>.
 * @author Sean A. Irvine
 */
public class A083314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083314() {
    super(new long[] {12, -19, 8}, new long[] {1, 3, 12});
  }
}
