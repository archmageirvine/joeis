package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390275 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A390275 extends A390670 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    step();
    return mRow[1];
  }
}
