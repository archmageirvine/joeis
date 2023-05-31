package irvine.oeis.a128;
// manually 2023-05-31

import irvine.oeis.a008.A008683;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A128407 Triangle read by rows: T(n,n) = mobius(n) on the diagonal, zero elsewhere.
 * @author Georg Fischer
 */
public class A128407 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A128407() {
    super("0", new A008683());
    setPlus("0");
  }
}
