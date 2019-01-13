package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Danish;

/**
 * A003078.
 * @author Sean A. Irvine
 */
public class A003078 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Danish.toDanish(++mN).replace(" ", "").length());
  }
}

