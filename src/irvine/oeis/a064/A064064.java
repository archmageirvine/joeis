package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064064 n-th step is to add a(n) to each previous number a(k) (including itself, i.e., k &lt;= n) to produce n+1 more terms of the sequence, starting with a(0)=1.
 * @author Sean A. Irvine
 */
public class A064064 extends A064002 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
