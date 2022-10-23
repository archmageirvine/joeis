package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033326 a(n) = floor(6/n).
 * @author Sean A. Irvine
 */
public class A033326 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.SIX.divide(++mN);
  }
}

