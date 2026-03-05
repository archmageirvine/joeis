package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A061375 Integer part of geometric mean of first n positive integers.
 * @author Sean A. Irvine
 */
public class A061375 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mF.next().root(++mN);
  }
}

