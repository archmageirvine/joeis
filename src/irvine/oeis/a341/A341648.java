package irvine.oeis.a341;
// Generated by gen_seq4.pl rowsums at 2023-05-31 13:23

import irvine.oeis.a059.A059433;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A341648 a(n) = Sum_{k=0..n} A059434(n,k).
 * @author Georg Fischer
 */
public class A341648 extends RowSumSequence {

  /** Construct the sequence. */
  public A341648() {
    super(0, new A059433());
  }
}
