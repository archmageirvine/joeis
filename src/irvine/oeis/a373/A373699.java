package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-11/partsun at 2024-07-11 18:00

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a024.A024675;

/**
 * A373699 a(n) is the area of the (n+1)-gon having vertices coordinates (2,0), (2,prime(2)), ..., (n,prime(n)), (n,0).
 * @author Georg Fischer
 */
public class A373699 extends PartialSumSequence {

  /** Construct the sequence. */
  public A373699() {
    super(3, new A024675());
  }
}
