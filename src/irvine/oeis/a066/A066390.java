package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066390 Smallest cube that contains exactly n consecutive internal 0's and no other 0s.
 * @author Sean A. Irvine
 */
public class A066390 extends A066391 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

