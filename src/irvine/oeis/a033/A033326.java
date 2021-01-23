package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033326 [ 6/n ].
 * @author Sean A. Irvine
 */
public class A033326 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.SIX.divide(++mN);
  }
}

