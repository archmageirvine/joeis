package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A387265 Rectangular array (d(n,k)) read by falling antidiagonals: d(n,k)= denominator of q(n,k) in the array U(1), defined in Comments.
 * @author Sean A. Irvine
 */
public class A387265 extends A387266 {

  @Override
  public Z next() {
    return Functions.NEXT_PRIME.z(super.next());
  }
}

