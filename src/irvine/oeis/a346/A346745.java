package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346745.
 * @author Sean A. Irvine
 */
public class A346745 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A346745() {
    super(CR.PI.sinh()
      .multiply(CR.PI.multiply(SQRT3).divide(CR.TWO).cosh().pow(2))
      .multiply(CR.PI.cosh().subtract(CR.PI.multiply(SQRT3).cos()))
      .divide(CR.PI.pow(5).multiply(24))
    );
  }
}

