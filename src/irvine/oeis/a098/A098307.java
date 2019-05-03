package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098307 Unsigned member <code>r=-7</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098307() {
    super(new long[] {-1, 8, 8}, new long[] {0, 1, 7});
  }
}
