package irvine.oeis.a348;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A348373 Decimal expansion of Sum_{k&gt;=1} H(k)^2/2^k, where H(k) = A001008(k)/A002805(k) is the k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A348373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A348373() {
    super(1, CR.PI.square().divide(CR.SIX).add(CR.LOG2.square()));
  }
}
