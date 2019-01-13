package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000136.
 * @author Sean A. Irvine
 */
public class A000136 implements Sequence {

  private final A000682 mA682 = new A000682();
  private long mN = 0;

  @Override
  public Z next() {
    return mA682.next().multiply(++mN);
  }
}

