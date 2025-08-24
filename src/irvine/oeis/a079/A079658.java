package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079658 extends FilterSequence {

  /** Construct the sequence. */
  public A079658() {
    super(1, new A000045(), k -> (Functions.SYNDROME.i(k) & 0b1101101101) == 0);
  }
}

