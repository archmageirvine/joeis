package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000934 Chromatic number (or Heawood number) <code>Chi(n)</code> of surface of genus n.
 * @author Sean A. Irvine
 */
public class A000934 implements Sequence {

  private long mN = -48;

  @Override
  public Z next() {
    mN += 48;
    return Z.valueOf((long) Math.floor(0.5 * (7 + Math.sqrt(1 + mN))));
  }
}
