package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a249.A249223;
import irvine.oeis.a298.A298856;

/**
 * A394935 a(n) is the smallest k for which the number of parts of the symmetric representation of sigma of k, SRS(k), is odd and the lower Dyck path of SRS(k) touches the diagonal at the same point as A298856(k).
 * @author Sean A. Irvine
 */
public class A394935 extends A298856 {

  private final A249223 mA = new A249223();

  @Override
  public Z next() {
    long n = super.next().longValueExact();
    while (mA.t(++n, Functions.TRINV.l(n)) == 0) {
      // do nothing
    }
    return Z.valueOf(n);
  }
}
