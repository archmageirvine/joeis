package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016758 <code>a(n) = (2*n+1)^6</code>.
 * @author Sean A. Irvine
 */
public class A016758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016758() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 729, 15625, 117649, 531441, 1771561, 4826809});
  }
}
