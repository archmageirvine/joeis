package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a390.A390670;

/**
 * A386599 Number of words covering the alphabet [n] that are irreducible with respect to C, where C is a subset of the alphabet such that all letters in C appear in weakly increasing order within the word.
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
