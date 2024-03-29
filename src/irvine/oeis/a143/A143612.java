package irvine.oeis.a143;
// Generated by gen_seq4.pl triprod at 2023-06-05 17:58

import irvine.oeis.a000.A000012;
import irvine.oeis.a127.A127368;
import irvine.oeis.triangle.Product;

/**
 * A143612 Triangle read by rows, A127368 * A000012, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143612 extends Product {

  /** Construct the sequence. */
  public A143612() {
    super(1, new A127368(), new A000012());
  }
}
