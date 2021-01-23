package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130215 Order of modular group of degree 7^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A130215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130215() {
    super(new long[] {-2401, 350}, new long[] {0, 168});
  }
}
