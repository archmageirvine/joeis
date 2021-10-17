package irvine.oeis.a038;
// manually 2021-10-14

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Product;

/**
 * A038207 Triangle whose (i,j)-th entry is binomial(i,j)*2^(i-j). 
 * @author Georg Fischer
 */
public class A038207 extends Product {

  /** Construct the sequence. */
  public A038207() {
    super(new A007318(), new A007318());
  }
}
