package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010854 Constant sequence: <code>a(n) = 15</code>.
 * @author Sean A. Irvine
 */
public class A010854 implements Sequence {

  private static final Z FIFTEEN = Z.valueOf(15);

  @Override
  public Z next() {
    return FIFTEEN;
  }
}

