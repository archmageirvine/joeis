package irvine.oeis.a131;
// manually triprom/triprod at 2023-06-09 07:06

import irvine.oeis.a000.A000203;
import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.DotProduct;

/**
 * A131046 A007318 * A000203.
 * @author Georg Fischer
 */
public class A131046 extends DotProduct {

  /** Construct the sequence. */
  public A131046() {
    super(1, new A007318(), new A000203());
  }
}
