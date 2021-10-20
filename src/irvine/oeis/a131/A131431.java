package irvine.oeis.a131;
// manually triconst at 2021-10-19 19:47

import irvine.oeis.a016.A016777;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A131431 3n + 1 preceded by n zeros.
 * @author Georg Fischer
 */
public class A131431 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A131431() {
    super("0", new A016777());
    setPlus("0");
  }
}
