package irvine.oeis.a129;
// Generated by gen_seq4.pl robot/triprod at 2023-07-04 10:40

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Product;

/**
 * A129570 A007318 * A129360.
 * @author Georg Fischer
 */
public class A129570 extends Product {

  /** Construct the sequence. */
  public A129570() {
    super(1, new A007318(), new A129360());
  }
}
