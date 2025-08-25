package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A079657 Fibonacci numbers using only the curved digits 0, 3, 6, 8 and 9.
 * @author Sean A. Irvine
 */
public class A079657 extends FilterSequence {

  /** Construct the sequence. */
  public A079657() {
    super(1, new A000045(), k -> (Functions.SYNDROME.i(k) & 0b0010110110) == 0);
  }
}

