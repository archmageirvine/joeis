package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271528 <code>a(n) = 2*(10^n - 1)^2/27</code>.
 * @author Sean A. Irvine
 */
public class A271528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271528() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 6, 726});
  }
}
