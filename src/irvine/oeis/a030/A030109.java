package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030109 Write n in binary, reverse bits, subtract 1, divide by 2.
 * @author Sean A. Irvine
 */
public class A030109 extends A030101 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
