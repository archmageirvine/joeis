package irvine.oeis.a127;
// Generated by gen_seq4.pl robot/triprod at 2023-06-29 14:31

import irvine.oeis.a051.A051731;
import irvine.oeis.triangle.Product;

/**
 * A127641 A127640 * A051731 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A127641 extends Product {

  /** Construct the sequence. */
  public A127641() {
    super(1, new A127640(), new A051731());
  }
}
