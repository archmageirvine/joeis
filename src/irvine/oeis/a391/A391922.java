package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A391922 Numbers that are neither cubefree nor powerful and have exactly 2 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A391922 extends FilterSequence {

  /** Construct the sequence. */
  public A391922() {
    super(new A391319(), k -> Functions.OMEGA.i(k) == 2);
  }
}
