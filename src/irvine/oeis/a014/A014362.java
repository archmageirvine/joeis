package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014362 Aliquot sequence starting at 660.
 * @author Sean A. Irvine
 */
public class A014362 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(660);
  }
}
