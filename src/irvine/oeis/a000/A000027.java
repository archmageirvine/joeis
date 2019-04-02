package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000027 The positive integers. Also called the natural numbers, the whole numbers or the counting numbers, but these terms are ambiguous.
 * @author Sean A. Irvine
 */
public class A000027 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN);
  }
}

