package irvine.oeis.a321;
// Generated by gen_seq4.pl 2024-09-02.ack/trilambn at 2024-09-02 22:06

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A321789 Factorials of terms of Pascal's triangle by row.
 * @author Georg Fischer
 */
public class A321789 extends LambdaTriangle {

  /** Construct the sequence. */
  public A321789() {
    super(1, 0, 0, (n, k) -> Functions.FACTORIAL.z(Binomial.binomial(n, k)));
  }
}
