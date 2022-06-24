package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.BrazilianPortuguese;

/**
 * A057696 Number of letters in n in Brazilian Portuguese (not counting spaces).
 * @author Sean A. Irvine
 */
public class A057696 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(BrazilianPortuguese.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}
