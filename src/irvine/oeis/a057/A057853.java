package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Esperanto;

/**
 * A057853 Number of letters in n (in Esperanto).
 * @author Sean A. Irvine
 */
public class A057853 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Esperanto.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}
