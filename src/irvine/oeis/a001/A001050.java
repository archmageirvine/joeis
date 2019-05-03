package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Finnish;

/**
 * A001050 Number of letters in <code>n (in Finnish)</code>.
 * @author Sean A. Irvine
 */
public class A001050 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Finnish.toFinnish(++mN).length());
  }
}
