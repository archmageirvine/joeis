package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A008888.
 * @author Sean A. Irvine
 */
public class A008888 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(138);
  }
}
