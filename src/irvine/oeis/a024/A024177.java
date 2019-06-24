package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024177 <code>a(n) =</code> floor <code>( (2nd</code> elementary symmetric function of <code>2,3,...,n+2)/(2+3+...+n+2) )</code>.
 * @author Sean A. Irvine
 */
public class A024177 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3).add(23).multiply(mN).add(46).multiply(mN).divide(mN + 4).divide(12);
  }
}
