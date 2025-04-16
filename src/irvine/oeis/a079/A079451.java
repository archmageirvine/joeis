package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A079451 Largest prime dividing the n-th Lucas number (A000032); 1 when no such prime exists.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A079451 extends A000032 {

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
