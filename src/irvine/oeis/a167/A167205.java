package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167205 <code>a(n) = (3^n+1)/(3-(-1)^n)</code>.
 * @author Sean A. Irvine
 */
public class A167205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167205() {
    super(new long[] {-9, 0, 10, 0}, new long[] {1, 1, 5, 7});
  }
}
