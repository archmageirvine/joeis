package irvine.oeis.a177;

import irvine.oeis.a007.A007318;
import irvine.oeis.a070.A070909;
import irvine.oeis.triangle.Product;

/**
 * A177954 Triangle read by rows, A070909 * Pascal's triangle.
 * @author Georg Fischer
 */
public class A177954 extends Product {

  /** Construct the sequence. */
  public A177954() {
    super(new A070909(), new A007318());
    hasRAM(false);
  }
}
