package irvine.oeis.a027;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.DottedHebrew;

/**
 * A027684 Number of letters in n (in "dotted" Hebrew).
 * @author Sean A. Irvine
 */
public class A027684 extends Sequence0 implements Conjectural {


  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(DottedHebrew.SINGLETON.toRawText(++mN).length());
  }
}
