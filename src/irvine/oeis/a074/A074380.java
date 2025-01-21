package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001567;

/**
 * A074380 Sarrus numbers n (A001567) which satisfy mu(n) = -1 and which are not Super-Poulet numbers (A050217).
 * @author Sean A. Irvine
 */
public class A074380 extends FilterSequence {

  /** Construct the sequence. */
  public A074380() {
    super(1, new A001567(), k -> Functions.MOBIUS.i(k) == -1 && !Predicates.SUPER_POULET.is(k));
  }
}
