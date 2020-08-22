package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034166 Maximum length of 'zig-zag' self avoiding walk on an n X n lattice from a corner to opposite one.
 * @author Sean A. Irvine
 */
public class A034166 extends A034165 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxLength);
  }
}

