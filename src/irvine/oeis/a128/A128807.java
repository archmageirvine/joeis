package irvine.oeis.a128;
// Generated by gen_seq4.pl robot/triprod at 2023-06-29 14:31

import irvine.oeis.a007.A007318;
import irvine.oeis.a115.A115361;
import irvine.oeis.triangle.Product;

/**
 * A128807 A115361 * A007318.
 * @author Georg Fischer
 */
public class A128807 extends Product {

  /** Construct the sequence. */
  public A128807() {
    super(0, new A115361(), new A007318());
  }
}
