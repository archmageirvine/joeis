package irvine.oeis.a290;
// Generated by gen_seq4.pl robot/triprod at 2023-06-01 09:43

import irvine.oeis.a225.A225468;
import irvine.oeis.a225.A225470;
import irvine.oeis.triangle.Product;

/**
 * A290598 Triangle read by rows. A generalization of unsigned Lah numbers, called L[3,2].
 * @author Georg Fischer
 */
public class A290598 extends Product {

  /** Construct the sequence. */
  public A290598() {
    super(0, new A225470(), new A225468());
  }
}
