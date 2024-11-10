package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073007.
 * @author Sean A. Irvine
 */
public class A073012 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A073012() {
    super(0, CR.SQRT2.multiply(new Q(17, 105))
      .add(new Q(4, 105))
      .subtract(SQRT3.multiply(new Q(2, 35)))
      .add(CR.SQRT2.add(1).log().divide(5))
      .add(SQRT3.add(2).log().multiply(new Q(2, 5)))
      .subtract(CR.PI.divide(15))
    );
  }
}
