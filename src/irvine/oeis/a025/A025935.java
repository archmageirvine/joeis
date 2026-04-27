package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025935 Expansion of 1/((1-2*x)*(1-3*x)*(1-5*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A025935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025935() {
    super(new long[] {-330, 371, -141, 21}, new long[] {1, 21, 300, 3710});
  }
}
