package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130214 Order of modular group of degree 5^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A130214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130214() {
    super(new long[] {-625, 130}, new long[] {0, 60});
  }
}
