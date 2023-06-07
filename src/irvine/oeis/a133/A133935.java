package irvine.oeis.a133;
// manually triprod at 2023-06-06 09:14

import irvine.oeis.a007.A007318;
import irvine.oeis.a093.A093178;
import irvine.oeis.triangle.VectorProduct;

/**
 * A133935 A007318 * A093178 as a diagonalized matrix.
 * @author Georg Fischer
 */
public class A133935 extends VectorProduct {

  /** Construct the sequence. */
  public A133935() {
    super(0, new A007318(), new A093178() {
      {
        next();
      }
    });
  }
}
