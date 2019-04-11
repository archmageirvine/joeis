package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051028 Ramanujan's a-series: expansion of <code>(1+53x+9x^2)/(1-82x-82x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A051028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051028() {
    super(new long[] {-1, 82, 82}, new long[] {1, 135, 11161});
  }
}
