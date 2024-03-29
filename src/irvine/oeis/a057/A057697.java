package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.BrazilianPortuguese;

/**
 * A057697 Number of characters in n (including spaces) in Brazilian Portuguese.
 * @author Sean A. Irvine
 */
public class A057697 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(BrazilianPortuguese.SINGLETON.toText(++mN).length());
  }
}
