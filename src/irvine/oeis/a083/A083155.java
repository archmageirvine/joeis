package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083155 a(1) = 9, a(n) = smallest nontrivial palindromic multiple of a(n-1). a(n) is not equal to a(n-1) or a concatenation of a(n-1) with itself.
 * @author Sean A. Irvine
 */
public class A083155 extends A083147 {

  /** Construct the sequence. */
  public A083155() {
    super(Z.NINE);
  }
}

