package irvine.oeis.a020;

import irvine.oeis.a000.A000930;
import irvine.oeis.a064.A064105;

/**
 * A020942 First column of 3rd-order Zeckendorf array.
 * @author Sean A. Irvine
 */
public class A020942 extends A064105 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A020942() {
    super(new A000930().skip(2), 3);
  }
}
