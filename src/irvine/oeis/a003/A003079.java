package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003079 One of the basic cycles in the x-&gt;3x-1 (x odd) or x/2 (x even) problem.
 * @author Sean A. Irvine
 */
public class A003079 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    mN = (mN & 1) == 0 ? mN / 2 : 3 * mN - 1;
    return Z.valueOf(mN);
  }
}

