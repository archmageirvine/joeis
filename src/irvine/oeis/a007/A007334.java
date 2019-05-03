package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007334 Number of spanning trees in the graph <code>K_{n}/e</code>, which results from contracting an edge e in the complete graph <code>K_{n}</code> on n vertices <code>(for n&gt;=2)</code>.
 * @author Sean A. Irvine
 */
public class A007334 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(mN - 3).multiply2();
  }
}
