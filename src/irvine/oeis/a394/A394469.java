package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394469 Decimal expansion of the average reciprocal of Euclidean distance between two randomly picked points, one of which is located in a unit cube and the other in an adjacent unit cube, both axis-parallel, with the two cubes sharing one common vertex.
 * @author Sean A. Irvine
 */
public class A394469 extends DecimalExpansionSequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private static final CR SQRT3 = CR.THREE.sqrt();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR SQRT6 = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A394469() {
    super(0, C.atan(CR.valueOf(new Q(2, 3)).sqrt()).multiply(24)
      .subtract(CR.TAU.multiply(2))
      .add(CR.valueOf(new Q(66, 5)))
      .subtract(C.atan(CR.valueOf(new Q(4, 3))).multiply(16))
      .add(C.atan(CR.THREE).multiply(8))
      .subtract(CR.SQRT2.multiply(new Q(9, 5)))
      .subtract(SQRT3.multiply(new Q(12, 5)))
      .subtract(SQRT5)
      .subtract(SQRT6.multiply(new Q(9, 5)))
      .subtract(CR.LOG2.multiply(24))
      .subtract(CR.FIVE.log().multiply(7))
      .subtract(CR.SQRT2.add(1).log().multiply(9))
      .add(SQRT3.add(1).log().multiply(12))
      .add(SQRT5.add(1).log().multiply(8))
      .add(SQRT6.add(1).log().multiply(7))
      .add(SQRT5.add(2).log())
      .add(SQRT6.add(2).log().multiply(4))
    );
  }
}
