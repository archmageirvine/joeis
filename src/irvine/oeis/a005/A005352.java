package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005352 Base -2 representation of -n reinterpreted as binary.
 * @author Sean A. Irvine
 */
public class A005352 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(A005351.negativeRepresentation(--mN, -2), 2);
  }
}
