package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010852.
 * @author Sean A. Irvine
 */
public class A010852 implements Sequence {

  private static final Z THIRTEEN = Z.valueOf(13);

  @Override
  public Z next() {
    return THIRTEEN;
  }
}

