package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025173 The Gegenbauer Polynomial of index <code>n,</code> order 1, evaluated at <code>x=1/3</code> and multiplied by <code>n*3^n/2</code>.
 * @author Sean A. Irvine
 */
public class A025173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025173() {
    super(new long[] {-81, 36, -22, 4}, new long[] {0, 1, -5, -42});
  }
}
