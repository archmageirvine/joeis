package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098306 Unsigned member <code>r=-6</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098306() {
    super(new long[] {-1, 7, 7}, new long[] {0, 1, 6});
  }
}
