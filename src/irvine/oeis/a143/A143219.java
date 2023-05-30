package irvine.oeis.a143;
// manually triprod at 2023-05-30 13:31

import irvine.oeis.a002.A002024;
import irvine.oeis.a127.A127773;
import irvine.oeis.triangle.Product;

/**
 * A143219 Triangle read by rows, A127648 * A000012 * A127773, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A143219 extends Product {

  /** Construct the sequence. */
  public A143219() {
    super(1, new A002024(), new A127773());
  }
}
