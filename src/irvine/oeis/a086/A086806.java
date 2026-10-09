package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001567;

/**
 * A086806 Sarrus numbers k such that k-1 and k+1 have the same number of prime divisors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A086806 extends FilterSequence {

  /** Construct the sequence. */
  public A086806() {
    super(1, new A001567(), k -> Functions.BIG_OMEGA.l(k.subtract(1)) == Functions.BIG_OMEGA.l(k.add(1)));
  }
}
