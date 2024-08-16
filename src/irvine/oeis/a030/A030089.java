package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A030089 a(n) = prime^3 and digits of prime do not appear in a(n).
 * @author Sean A. Irvine
 */
public class A030089 extends Sequence1 {

  private static final Sequence A030087 = new A030087();

  @Override
  public Z next() {
    return A030087.next().pow(3);
  }
}
