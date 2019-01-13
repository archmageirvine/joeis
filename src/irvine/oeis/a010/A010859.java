package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010859.
 * @author Sean A. Irvine
 */
public class A010859 implements Sequence {

  private static final Z TWENTY = Z.valueOf(20);

  @Override
  public Z next() {
    return TWENTY;
  }
}

