package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394468 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A394468 extends DecimalExpansionSequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private static final CR SQRT3 = CR.THREE.sqrt();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR SQRT6 = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A394468() {
    super(0, CR.TAU
      .subtract(C.atan(CR.valueOf(new Q(2, 3)).sqrt()).multiply(16))
      .subtract(CR.valueOf(new Q(88, 15)))
      .add(C.atan(CR.valueOf(new Q(4, 3))).multiply(4))
      .add(CR.SQRT2.multiply(new Q(4, 3)))
      .subtract(SQRT3.multiply(new Q(4, 5)))
      .add(SQRT5)
      .add(SQRT6.multiply(new Q(6, 5)))
      .add(CR.LOG2.multiply(10))
      .add(CR.FIVE.log().multiply(new Q(7, 2)))
      .add(CR.SQRT2.add(1).log().multiply(new Q(20, 3)))
      .add(SQRT3.add(1).log().multiply(4))
      .subtract(SQRT5.add(1).log().multiply(8))
      .subtract(SQRT6.add(1).log().multiply(new Q(14, 3)))
      .subtract(SQRT5.add(2).log())
      .subtract(SQRT6.add(2).log().multiply(new Q(8, 3)))
    );
  }
}
