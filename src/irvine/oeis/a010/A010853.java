package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010853 Constant sequence: a(n) = 14.
 * @author Sean A. Irvine
 */
public class A010853 implements Sequence {

  private static final Z FOURTEEN = Z.valueOf(14);

  @Override
  public Z next() {
    return FOURTEEN;
  }
}

