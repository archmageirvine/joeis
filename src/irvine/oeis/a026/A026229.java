package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026229 Numbers k such that A026166(k) = A026142(k) - 2.
 * @author Sean A. Irvine
 */
public class A026229 extends A026142 {

  private final Sequence mS = new A026166();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().add(2).equals(super.next()));
    return Z.valueOf(mN);
  }
}
