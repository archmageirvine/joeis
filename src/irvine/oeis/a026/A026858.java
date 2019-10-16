package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Italian;

/**
 * A026858 Number of letters in <code>n</code> (in Italian).
 * @author Sean A. Irvine
 */
public class A026858 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Italian.toItalian(++mN).replace(" ", "").length());
  }
}
