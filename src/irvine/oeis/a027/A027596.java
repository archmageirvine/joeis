package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027596 Duplicate of <code>A007213</code>.
 * @author Sean A. Irvine
 */
public class A027596 extends A027595 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
