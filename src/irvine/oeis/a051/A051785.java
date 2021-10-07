package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Catalan;

/**
 * A051785 Number of letters in n-th Catalan number.
 * @author Sean A. Irvine
 */
public class A051785 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Catalan.SINGLETON.toText(++mN).replaceAll("[- ]", "").length());
  }
}
