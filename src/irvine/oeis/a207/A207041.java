package irvine.oeis.a207;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002997;

/**
 * A207041 Carmichael numbers that can be written as a product of two Carmichael numbers.
 * @author Sean A. Irvine
 */
public class A207041 extends TwoParameterFormSequence {

  private static final DirectSequence C = DirectSequence.forceCreate(0, new A002997());

  /** Construct the sequence. */
  public A207041() {
    super(1, 0, 0, (k, m) -> k <= m ? C.a(k.intValue()).multiply(C.a(m.intValue())) : null);
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return Predicates.CARMICHAEL.is(n);
  }
}

