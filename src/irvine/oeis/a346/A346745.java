package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346745 Decimal expansion of Product_{k&gt;=2} (1 - 1/k^12).
 * @author Sean A. Irvine
 */
public class A346745 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A346745() {
    super(0, CR.PI.sinh()
      .multiply(CR.PI.multiply(SQRT3).divide(CR.TWO).cosh().square())
      .multiply(CR.PI.cosh().subtract(CR.PI.multiply(SQRT3).cos()))
      .divide(CR.PI.pow(5).multiply(24))
    );
  }
}

