package irvine.oeis.a048;
// manually/basrunid at 2022-09-02

import irvine.math.z.Z;

/**
 * A048321 Reading a(n) expansion from left to right, run lengths strictly decrease.
 * @author Georg Fischer
 */
public class A048321 extends A048314 {

  /** Construct the sequence. */
  public A048321() {
    super(1, 10);
    mN = -1;
    mK = Z.valueOf(mN);
  }
}
