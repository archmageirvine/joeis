package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129725 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+521)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A129725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129725() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 100, 1159, 1563, 2079, 8080, 10420});
  }
}
