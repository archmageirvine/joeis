package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083153 a(1) = 7, a(n) = smallest nontrivial palindromic multiple of a(n-1). a(n) is not equal to a(n-1) or a concatenation of a(n-1) with itself.
 * @author Sean A. Irvine
 */
public class A083153 extends A083147 {

  /** Construct the sequence. */
  public A083153() {
    super(Z.SEVEN);
  }
}

