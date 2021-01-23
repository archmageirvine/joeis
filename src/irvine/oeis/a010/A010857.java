package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010857 Constant sequence: a(n) = 18.
 * @author Sean A. Irvine
 */
public class A010857 implements Sequence {

  private static final Z EIGHTEEN = Z.valueOf(18);

  @Override
  public Z next() {
    return EIGHTEEN;
  }
}

