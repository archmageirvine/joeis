package irvine.oeis.a175;

import irvine.oeis.FiniteSequence;

/**
 * A175894 <code>a(n) = sigma(d(n))</code> where <code>d(n)</code> is n-th divisor of <code>101010 (n=1..64)</code>.
 * @author Georg Fischer
 */
public class A175894 extends FiniteSequence {

  /** Construct the sequence. */
  public A175894() {
    super(1, 3, 4, 6, 12, 8, 18, 14, 24, 24, 32, 42, 72, 48, 38, 56, 96, 84, 144, 114, 168, 112, 192, 152, 252, 336, 228, 336, 576, 456, 304, 448, 684, 1008, 672, 532, 912, 1344, 912, 1216, 2016, 1596, 2736, 1824, 2688, 2128, 3648, 3192, 5472, 8064, 6384, 4256, 7296, 9576);
  }
}
