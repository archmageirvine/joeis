package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051029 Ramanujan's b-series: expansion of (2-26x-12x^2)/(1-82x-82x^2+x^3).
 * @author Sean A. Irvine
 */
public class A051029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051029() {
    super(new long[] {-1, 82, 82}, new long[] {2, 138, 11468});
  }
}
