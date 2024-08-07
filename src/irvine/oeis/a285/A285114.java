package irvine.oeis.a285;
// Generated by gen_seq4.pl 2024-07-11/rowsum at 2024-07-11 18:00

import irvine.oeis.triangle.RowSumSequence;

/**
 * A285114 Row sums of A285117: a(n) = 2 + Sum_{k=1..(n-1)} C(n-1,k-1) XOR C(n-1,k), a(0) = 1, a(1) = 2.
 * @author Georg Fischer
 */
public class A285114 extends RowSumSequence {

  /** Construct the sequence. */
  public A285114() {
    super(0, new A285117());
  }
}
