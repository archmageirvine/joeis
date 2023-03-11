package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a061.A061851;

/**
 * A001232 Numbers k such that 9*k = (k written backwards), k &gt; 0.
 * @author Sean A. Irvine
 */
public class A001232 extends A061851 {

  @Override
  public Z next() {
    return super.next().multiply(99);
  }
}
