package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019552 <code>a(n)</code> is the concatenation of n and <code>4n</code>.
 * @author Sean A. Irvine
 */
public class A019552 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(4 * mN));
  }
}
