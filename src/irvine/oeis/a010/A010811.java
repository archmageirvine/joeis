package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010811 23rd powers: <code>a(n) = n^23</code>.
 * @author Sean A. Irvine
 */
public class A010811 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(23);
  }
}
