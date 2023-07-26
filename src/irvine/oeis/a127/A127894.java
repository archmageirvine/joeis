package irvine.oeis.a127;
// manually inverse at 2023-07-24

import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A127894 Inverse of Riordan array (1/(1-x)^3, x/(1-x)^3).
 * @author Georg Fischer
 */
public class A127894 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A127894() {
    super(0, new Inverse(0, new A127893()), 1);
  }
}
