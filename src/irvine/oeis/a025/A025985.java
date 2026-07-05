package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025985 Expansion of 1/((1-2*x)*(1-4*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025985() {
    super(new long[] {-1056, 976, -278, 29}, new long[] {1, 29, 563, 9241});
  }
}
