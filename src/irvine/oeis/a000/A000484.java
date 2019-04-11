package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000484 <code>a(n) =</code> round(cos(n)).
 * @author Sean A. Irvine
 */
public class A000484 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(Math.cos(++mN)));
  }
}
