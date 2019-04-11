package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010855 Constant sequence: <code>a(n) = 16</code>.
 * @author Sean A. Irvine
 */
public class A010855 implements Sequence {

  private static final Z SIXTEEN = Z.valueOf(16);

  @Override
  public Z next() {
    return SIXTEEN;
  }
}

