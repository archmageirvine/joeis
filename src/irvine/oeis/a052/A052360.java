package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A052360 Number of characters in the English name of n, including spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A052360 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toText(++mN).replace(" and", "").length());
  }
}
