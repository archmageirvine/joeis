package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228579 x-values in the solution to the Pell equation <code>x^2 - 106*y^2 = -1</code>.
 * @author Sean A. Irvine
 */
public class A228579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228579() {
    super(new long[] {-1, 64160102}, new long[] {4005, 256961212515L});
  }
}
