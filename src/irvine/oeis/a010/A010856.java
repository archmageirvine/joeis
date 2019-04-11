package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010856 Constant sequence: <code>a(n) = 17</code>.
 * @author Sean A. Irvine
 */
public class A010856 implements Sequence {

  private static final Z SEVENTEEN = Z.valueOf(17);

  @Override
  public Z next() {
    return SEVENTEEN;
  }
}

