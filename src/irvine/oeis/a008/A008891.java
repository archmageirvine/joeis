package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A008891.
 * @author Sean A. Irvine
 */
public class A008891 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(180);
  }
}
