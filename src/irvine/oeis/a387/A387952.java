package irvine.oeis.a387;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a073.A073024;

/**
 * A387952 Squarefree semiprimes whose prime factors are in A073024.
 * @author Sean A. Irvine
 */
public class A387952 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.forceCreate(0, new A073024());

  /** Construct the sequence. */
  public A387952() {
    super(1, 0, 1, (a, b) -> a < b ? S.a(a.intValue()).multiply(S.a(b.intValue())) : null);
  }
}
