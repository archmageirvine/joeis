package irvine.oeis.a081;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A081621 Number of n-node triangulations of the sphere with minimal degree 5.
 * @author Sean A. Irvine
 */
public class A081621 extends AbstractSequence {

  /* Construct the sequence. */
  public A081621() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    if (++mN < 12) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, 5, -1, -1, false, false, false, false));
  }

}

