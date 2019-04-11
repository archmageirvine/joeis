package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005352 Base <code>-2</code> representation of <code>-n</code> reinterpreted as binary.
 * @author Sean A. Irvine
 */
public class A005352 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(A005351.negativeRepresentation(--mN, -2), 2);
  }
}
