package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099197 a(n) = (n^2)*(2*n^8+120*n^6+1806*n^4+7180*n^2+5067)/14175.
 * @author Sean A. Irvine
 */
public class A099197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099197() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 20, 201, 1360, 7001, 29364, 104881, 329024, 927441, 2390004});
  }
}
