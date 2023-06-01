package irvine.oeis.a134;
// manually binomx at 2023-06-01 10:26

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Product;

/**
 * A134318 A007318 * A134317.
 * @author Georg Fischer
 */
public class A134318 extends Product {

  /** Construct the sequence. */
  public A134318() {
    super(0, new A007318(), new A134317());
  }
}
