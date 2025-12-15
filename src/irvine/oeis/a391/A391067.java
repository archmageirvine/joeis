package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A391067 a(n) is the exponent of 2 of the last term of the map x -&gt; A087207(x) before reaching 1 when starting with A019565(n) or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A391067 extends A391066 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), 2);
  }
}
