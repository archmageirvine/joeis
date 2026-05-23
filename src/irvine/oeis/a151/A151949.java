package irvine.oeis.a151;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A151949 a(n) = image of n under the Kaprekar map n -&gt; (n with digits sorted into descending order) - (n with digits sorted into ascending order).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A151949 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.KAPREKAR.z(++mN);
  }
}
