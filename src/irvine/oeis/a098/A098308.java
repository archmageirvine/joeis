package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098308 Unsigned member <code>r=-8</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098308() {
    super(new long[] {-1, 9, 9}, new long[] {0, 1, 8});
  }
}
