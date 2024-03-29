package irvine.oeis.a132;
// Generated by gen_seq4.pl triprom/triprod at 2023-06-01 21:50

import irvine.oeis.a130.A130595;
import irvine.oeis.triangle.Product;

/**
 * A132816 Triangle read by rows: A007318^(-1) * A132812.
 * @author Georg Fischer
 */
public class A132816 extends Product {

  /** Construct the sequence. */
  public A132816() {
    super(0, new A130595(), new A132812());
  }
}
