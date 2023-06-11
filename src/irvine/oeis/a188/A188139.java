package irvine.oeis.a188;
// manually triprod at 2023-06-10 09:20

import irvine.oeis.a027.A027293;
import irvine.oeis.a129.A129372;
import irvine.oeis.triangle.Product;

/**
 * A188139 Triangle by rows, A027293 * A129372 as infinite lower triangular matrices
 * @author Georg Fischer
 */
public class A188139 extends Product {

  /** Construct the sequence. */
  public A188139() {
    super(1, new A027293(), new A129372());
  }
}
