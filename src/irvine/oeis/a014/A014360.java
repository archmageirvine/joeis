package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014360 Aliquot sequence starting at 552.
 * @author Sean A. Irvine
 */
public class A014360 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(552);
  }
}
