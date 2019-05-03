package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Spanish;

/**
 * A011762 Number of letters in <code>n</code> (in Spanish).
 * @author Sean A. Irvine
 */
public class A011762 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Spanish.toSpanish(++mN).replace(" ", "").length());
  }
}
