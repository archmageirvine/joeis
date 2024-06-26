package irvine.oeis.a064;

import irvine.oeis.a000.A000930;

/**
 * A064106 3rd column of 3rd-order Zeckendorf array A136189.
 * @author Sean A. Irvine
 */
public class A064106 extends A064105 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A064106() {
    super(new A000930().skip(4), 3);
  }
}
