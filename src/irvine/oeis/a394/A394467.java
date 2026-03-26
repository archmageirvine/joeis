package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394467 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A394467 extends DecimalExpansionSequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private static final CR SQRT3 = CR.THREE.sqrt();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR SQRT6 = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A394467() {
    super(0, C.atan(CR.valueOf(new Q(2, 3)).sqrt()).multiply(8)
      .subtract(CR.TAU)
      .add(new Q(28, 15))
      .subtract(CR.SQRT2.divide(3))
      .add(SQRT3.multiply(new Q(4, 5)))
      .subtract(SQRT5.multiply(new Q(2, 3)))
      .subtract(SQRT6.multiply(new Q(3, 5)))
      .subtract(CR.LOG2.multiply(4))
      .subtract(CR.FIVE.log().multiply(new Q(7, 6)))
      .subtract(CR.SQRT2.add(1).log().multiply(new Q(5, 3)))
      .subtract(SQRT3.add(1).log().multiply(4))
      .add(SQRT5.add(1).log().multiply(new Q(16, 3)))
      .add(SQRT6.add(1).log().multiply(new Q(7, 3)))
      .add(SQRT5.add(2).log().multiply(new Q(2, 3)))
      .add(SQRT6.add(2).log().multiply(new Q(4, 3)))
    );
  }
}
