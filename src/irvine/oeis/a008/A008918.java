package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001232;

/**
 * A008918 Numbers k such that 4*k = (k written backwards), k &gt; 0.
 * @author Sean A. Irvine
 */
public class A008918 extends A001232 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

