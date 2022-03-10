package irvine.oeis.a055;

import irvine.oeis.a008.A008292;
import irvine.oeis.triangle.Inverse;

/**
 * A055325 Matrix inverse of Euler&apos;s triangle A008292.
 * @author Georg Fischer
 */
public class A055325 extends Inverse {

  /** Construct the sequence. */
  public A055325() {
    super(new A008292());
  }

}
