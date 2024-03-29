package irvine.oeis.a136;
// Generated by gen_seq4.pl triprod at 2023-06-05 17:58

import irvine.oeis.a001.A001263;
import irvine.oeis.a128.A128064;
import irvine.oeis.triangle.Product;

/**
 * A136535 A128064 * A001263.
 * @author Georg Fischer
 */
public class A136535 extends Product {

  /** Construct the sequence. */
  public A136535() {
    super(1, new A128064(), new A001263());
  }
}
