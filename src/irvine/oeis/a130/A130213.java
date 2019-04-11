package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130213 Order of modular group of degree <code>3^(n-1)+1</code>.
 * @author Sean A. Irvine
 */
public class A130213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130213() {
    super(new long[] {-81, 30}, new long[] {0, 12});
  }
}
