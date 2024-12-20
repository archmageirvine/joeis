package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-10.ack/triprod at 2024-10-10 21:17

import irvine.oeis.a007.A007318;
import irvine.oeis.a063.A063007;
import irvine.oeis.triangle.Product;

/**
 * A376467 Triangular array read by rows: A063007 * A007318.
 * @author Georg Fischer
 */
public class A376467 extends Product {

  /** Construct the sequence. */
  public A376467() {
    super(0, new A063007(), new A007318());
  }
}
