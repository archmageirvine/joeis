package irvine.oeis.a130;
// Generated by gen_seq4.pl triprod at 2023-05-30 18:09

import irvine.oeis.a007.A007318;
import irvine.oeis.a051.A051340;
import irvine.oeis.triangle.Product;

/**
 * A130265 Triangle read by rows: matrix product A007318 * A051340.
 * @author Georg Fischer
 */
public class A130265 extends Product {

  /** Construct the sequence. */
  public A130265() {
    super(0, new A007318(), new A051340());
  }
}
