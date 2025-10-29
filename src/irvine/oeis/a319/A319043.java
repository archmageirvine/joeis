package irvine.oeis.a319;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A319042 Composite numbers k such that Pell(k) == 1 (mod k).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A319043 extends FilterSequence {

  /** Construct the sequence. */
  public A319043() {
    super(1, new A002808(), k -> Fibonacci.pell(k, k).equals(k.subtract(1)));
  }
}
