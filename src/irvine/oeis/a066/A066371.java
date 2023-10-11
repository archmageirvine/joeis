package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066371 Smallest positive square that contains n consecutive internal 0's.
 * @author Sean A. Irvine
 */
public class A066371 extends A066392 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

