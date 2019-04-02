package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010692 Constant sequence: a(n) = 10.
 * @author Sean A. Irvine
 */
public class A010692 implements Sequence {

  @Override
  public Z next() {
    return Z.TEN;
  }
}
