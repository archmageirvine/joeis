package irvine.oeis.a374;

import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a007.A007510;

/**
 * A374591 Even numbers that can be written as the sum of two isolated primes (A007510).
 * @author Sean A. Irvine
 */
public class A374591 extends PrependSequence {

  private static final DirectSequence S = DirectSequence.create(new A007510());

  /** Construct the sequence. */
  public A374591() {
    super(1, new TwoParameterFormSequence(1, 2, 2, (j, k) -> S.a(j).add(S.a(k))), 4);
  }
}
