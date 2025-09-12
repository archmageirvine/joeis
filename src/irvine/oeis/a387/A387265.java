package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A387265 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A387265 extends A387266 {

  @Override
  public Z next() {
    return Functions.NEXT_PRIME.z(super.next());
  }
}

