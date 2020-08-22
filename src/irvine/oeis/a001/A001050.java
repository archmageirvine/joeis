package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Finnish;

/**
 * A001050 Number of letters in n (in Finnish).
 * @author Sean A. Irvine
 */
public class A001050 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Finnish.SINGLETON.toText(++mN).length());
  }
}
