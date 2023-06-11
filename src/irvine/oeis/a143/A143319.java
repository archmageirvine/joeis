package irvine.oeis.a143;
// manually triprod at 2023-06-10 09:20

import irvine.oeis.a051.A051731;
import irvine.oeis.triangle.Product;

/**
 * A143319 Triangle read by rows, A051731 * A143318; 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143319 extends Product {

  /** Construct the sequence. */
  public A143319() {
    super(1, new A051731(), new A143318());
  }
}
