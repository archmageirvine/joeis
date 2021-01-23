package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000012 The simplest sequence of positive numbers: the all 1's sequence.
 * @author Sean A. Irvine
 */
public class A000012 implements Sequence {
  @Override
  public Z next() {
    return Z.ONE;
  }
}

