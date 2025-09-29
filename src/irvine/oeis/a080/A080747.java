package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001567;

/**
 * A080747 Sarrus numbers with more than 2 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A080747 extends FilterSequence {

  /** Construct the sequence. */
  public A080747() {
    super(1, new A001567(), k -> Functions.OMEGA.i(k) > 2);
  }
}
