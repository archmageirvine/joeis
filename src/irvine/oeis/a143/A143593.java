package irvine.oeis.a143;
// manually triprod at 2023-05-30 13:31

import irvine.oeis.a238.A238303;
import irvine.oeis.triangle.Product;

/**
 * A143593 Triangle read by rows, square of A238303 (an infinite lower triangular matrix with 1's in the first column and the rest 2's).
 * @author Georg Fischer
 */
public class A143593 extends Product {

  /** Construct the sequence. */
  public A143593() {
    super(1, new A238303(), new A238303());
  }
}
