package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a071.A071904;

/**
 * A046340 Odd composite numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046340 extends FilterSequence {

  /** Construct the sequence. */
  public A046340() {
    super(1, new A071904(), k -> (Functions.BIG_OMEGA.l(k) & 1) == 1);
  }
}
