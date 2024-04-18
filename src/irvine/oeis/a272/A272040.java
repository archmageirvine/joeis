package irvine.oeis.a272;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000129;

/**
 * A272040 a(n) = A000010(A000129(n)).
 * @author Georg Fischer
 */
public class A272040 extends Sequence1 {

  private final Sequence mA = new A000129().skip();

  @Override
  public Z next() {
    return Functions.PHI.z(mA.next());
  }
}
