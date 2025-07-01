package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078447 Final terms of rows of A078448.
 * @author Sean A. Irvine
 */
public class A078447 extends A078448 {

  @Override
  public Z next() {
    step();
    return mRow[mRow.length - 1];
  }
}


