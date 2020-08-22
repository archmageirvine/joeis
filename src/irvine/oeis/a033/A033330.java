package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033330 Floor(10/n).
 * @author Sean A. Irvine
 */
public class A033330 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.TEN.divide(++mN);
  }
}

