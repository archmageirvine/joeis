package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a066.A066884;

/**
 * A067586 Number of 0's in the binary expansion of A066884(n+1).
 * @author Sean A. Irvine
 */
public class A067586 extends A066884 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    long zeros = 0;
    for (int k = 0; k < t.bitLength(); ++k) {
      if (!t.testBit(k)) {
        ++zeros;
      }
    }
    return Z.valueOf(zeros);
  }
}
