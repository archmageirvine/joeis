package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Turkish;

/**
 * A057435 Number of letters in the Turkish name of n, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A057435 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Turkish.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}
