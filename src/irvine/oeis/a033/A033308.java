package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033308 Decimal expansion of <code>Copeland-Erd\u0151s</code> constant: concatenate primes.
 * @author Sean A. Irvine
 */
public class A033308 extends A000040 {

  private String mS = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mS.length()) {
      mS = super.next().toString();
      mM = 0;
    }
    return Z.valueOf(mS.charAt(mM) - '0');
  }
}
