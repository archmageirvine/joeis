package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a390.A390670;

/**
 * A386599 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A386599 extends A390670 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
    } else {
      step();
    }
    return Functions.SUM.z(mRow);
  }
}
