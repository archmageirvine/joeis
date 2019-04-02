package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014363 Aliquot sequence starting at 966.
 * @author Sean A. Irvine
 */
public class A014363 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(966);
  }
}
