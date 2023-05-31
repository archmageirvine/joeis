package irvine.oeis.a130;
// manually 2023-05-31

import irvine.oeis.a000.A000005;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A130209 Diagonalized matrix of d(n), A000005.
 * @author Georg Fischer
 */
public class A130209 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A130209() {
    super("0", new A000005());
    setPlus("0");
  }
}
