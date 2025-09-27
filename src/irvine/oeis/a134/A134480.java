package irvine.oeis.a134;

import irvine.oeis.a000.A000012;
import irvine.oeis.a051.A051162;
import irvine.oeis.triangle.Product;

/**
 * A134480 Triangle read by rows: T(n,k) = Sum_{i=k..n} n + i.
 * @author Georg Fischer
 */
public class A134480 extends Product {

  /** Construct the sequence. */
  public A134480() {
    super(0, new A051162(), new A000012());
  }
}
