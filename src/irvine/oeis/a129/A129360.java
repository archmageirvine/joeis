package irvine.oeis.a129;
// Generated by gen_seq4.pl robot/triprod at 2023-06-29 14:31

import irvine.oeis.a054.A054525;
import irvine.oeis.a115.A115361;
import irvine.oeis.triangle.Product;

/**
 * A129360 A054525 * A115361.
 * @author Georg Fischer
 */
public class A129360 extends Product {

  /** Construct the sequence. */
  public A129360() {
    super(1, new A054525(), new A115361());
  }
}
