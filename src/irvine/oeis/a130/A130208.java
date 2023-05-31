package irvine.oeis.a130;
// manually 2023-05-31

import irvine.oeis.a000.A000203;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A130208 Diagonalized matrix of A000203, Sigma(n).
 * @author Georg Fischer
 */
public class A130208 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A130208() {
    super("0", new A000203());
    setPlus("0");
  }
}
