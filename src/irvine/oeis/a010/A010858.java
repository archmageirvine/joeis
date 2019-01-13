package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010858.
 * @author Sean A. Irvine
 */
public class A010858 implements Sequence {

  private static final Z NINETEEN = Z.valueOf(19);

  @Override
  public Z next() {
    return NINETEEN;
  }
}

