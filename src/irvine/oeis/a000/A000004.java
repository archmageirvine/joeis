package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000004 The zero sequence.
 * @author Sean A. Irvine
 */
public class A000004 implements Sequence {
  @Override
  public Z next() {
    return Z.ZERO;
  }
}

