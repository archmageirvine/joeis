package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a001.A001069;

/**
 * A010096 <code>log2*(n)</code> (version <code>1)</code>: number of times <code>floor(log_2(x))</code> is used in <code>floor(log_2(floor(log_2(...(floor(log_2(n)))...)))) = 0</code>.
 * @author Sean A. Irvine
 */
public class A010096 extends A001069 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
