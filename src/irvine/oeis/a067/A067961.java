package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000032;

/**
 * A067961 Number of binary arrangements without adjacent 1's on n X n torus connected n-s.
 * @author Sean A. Irvine
 */
public class A067961 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A000032().skip();

  @Override
  public Z next() {
    return mA.next().pow(++mN);
  }
}
