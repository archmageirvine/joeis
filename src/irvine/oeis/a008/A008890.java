package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A008890 Aliquot sequence starting at 168.
 * @author Sean A. Irvine
 */
public class A008890 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(168);
  }
}
