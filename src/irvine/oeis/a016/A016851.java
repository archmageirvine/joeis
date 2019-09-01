package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016851 <code>a(n) = (5*n)^3</code>.
 * @author Sean A. Irvine
 */
public class A016851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016851() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 125, 1000, 3375});
  }
}
