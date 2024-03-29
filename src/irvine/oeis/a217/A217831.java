package irvine.oeis.a217;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a054.A054521;
import irvine.oeis.a063.A063524;
import irvine.oeis.triangle.PrependColumn;

/**
 * A217831 Euclid's triangle read by rows. T(n, k) = 1 if k is prime to n, otherwise 0.
 * @author Georg Fischer
 */
public class A217831 extends PrependColumn {

  /** Construct the sequence. */
  public A217831() {
    super(0, new A054521(), new A063524());
  }
}

