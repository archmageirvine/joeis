package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130213 Order of modular group of degree 3^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A130213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130213() {
    super(new long[] {-81, 30}, new long[] {0, 12});
  }
}
