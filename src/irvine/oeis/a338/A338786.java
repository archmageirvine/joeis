package irvine.oeis.a338;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.IntersectionSequence;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002182;
import irvine.oeis.a002.A002201;
import irvine.oeis.a004.A004394;
import irvine.oeis.a004.A004490;

/**
 * A338786 Numbers in A166981 that are neither superior highly composite nor colossally abundant.
 * Complement of (the union of A002182 and A004394) and (the union of A002201 and A004490).
 * @author Georg Fischer
 */
public class A338786 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A338786() {
    super(1, new IntersectionSequence(new A002182(), new A004394()), new UnionSequence(new A002201(), new A004490()));
  }
}
