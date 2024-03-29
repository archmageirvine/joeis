package irvine.oeis.a129;
// Generated by gen_seq4.pl robot/triprod at 2023-06-30 10:58

import irvine.oeis.a007.A007318;
import irvine.oeis.a115.A115361;
import irvine.oeis.triangle.Product;

/**
 * A129262 Triangle read by rows, A007318 * A115361.
 * @author Georg Fischer
 */
public class A129262 extends Product {

  /** Construct the sequence. */
  public A129262() {
    super(1, new A007318(), new A115361());
  }
}
