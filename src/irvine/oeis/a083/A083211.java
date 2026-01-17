package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A083211 Abundant numbers (A005101) with no subset of their divisors such that the complement has the same sum.
 * @author Sean A. Irvine
 */
public class A083211 extends FilterSequence {

  /** Construct the sequence. */
  public A083211() {
    super(1, new A083210(), Predicates.ABUNDANT::is);
  }
}
