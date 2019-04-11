package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010850 Constant sequence: <code>a(n) = 11</code>.
 * @author Sean A. Irvine
 */
public class A010850 implements Sequence {

  private static final Z ELEVEN = Z.valueOf(11);

  @Override
  public Z next() {
    return ELEVEN;
  }
}

