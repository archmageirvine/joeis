package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001625 Related to Latin rectangles.
 * @author Sean A. Irvine
 */
public class A001625 extends A001624 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next(); // make sure both beta and gamma terms get computed
    return mGamma;
  }
}

