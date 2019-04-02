package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractAliquotSequence;

/**
 * A014361 Aliquot sequence starting at 564.
 * @author Sean A. Irvine
 */
public class A014361 extends AbstractAliquotSequence {

  @Override
  protected Z start() {
    return Z.valueOf(564);
  }
}
