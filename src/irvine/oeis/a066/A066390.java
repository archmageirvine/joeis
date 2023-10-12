package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066371 Smallest positive square that contains n consecutive internal 0's.
 * @author Sean A. Irvine
 */
public class A066390 extends A066391 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

