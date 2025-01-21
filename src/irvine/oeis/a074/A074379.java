package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002997;

/**
 * A074379 Carmichael numbers with exactly 4 prime factors.
 * @author Sean A. Irvine
 */
public class A074379 extends FilterSequence {

  /** Construct the sequence. */
  public A074379() {
    super(1, new A002997(), k -> Functions.BIG_OMEGA.l(k) == 4);
  }
}
