package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025936 Expansion of g.f. 1/((1-2*x)*(1-3*x)*(1-5*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025936() {
    super(new long[] {-360, 402, -151, 22}, new long[] {1, 22, 333, 4406});
  }
}
