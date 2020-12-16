package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000012.
 * @author Sean A. Irvine
 */
public class A000012 implements Sequence {
  @Override
  public Z next() {
    return Z.ONE;
  }
}

