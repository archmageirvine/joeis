package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014364 Aliquot sequence starting at 1074.
 * @author Sean A. Irvine
 */
public class A014364 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(1074);
  }
}
