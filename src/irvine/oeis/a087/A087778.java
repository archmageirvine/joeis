package irvine.oeis.a087;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A087778 Decimal expansion of Avogadro's constant <code>(in</code> mol^{-1}).
 * @author Sean A. Irvine
 */
public class A087778 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A087778() {
    super(PhysicsConstants.AVOGADRO, PhysicsConstants.AVOGADRO_UNC, true);
  }
}
