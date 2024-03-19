package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.oeis.FilterSequence;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068868 extends FilterSequence {

  /** Construct the sequence. */
  public A068868() {
    super(1, new A068863(), (k, v) -> v.equals(Puma.primeZ(k)));
  }
}
