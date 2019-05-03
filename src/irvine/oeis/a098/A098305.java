package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098305 Unsigned member <code>r=-5</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098305() {
    super(new long[] {-1, 6, 6}, new long[] {0, 1, 5});
  }
}
