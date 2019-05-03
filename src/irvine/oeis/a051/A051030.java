package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051030 Ramanujan's <code>c-series</code>: expansion of <code>(2+8*x-10*x^2)/(1-82*x-82*x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A051030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051030() {
    super(new long[] {-1, 82, 82}, new long[] {2, 172, 14258});
  }
}
