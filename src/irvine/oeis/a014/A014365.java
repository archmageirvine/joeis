package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014365.
 * @author Sean A. Irvine
 */
public class A014365 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(1134);
  }
}
