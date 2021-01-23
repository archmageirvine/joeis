package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001271 Irregular table read by rows: row n lists prime factors of 10^n +1, with multiplicity.
 * @author Sean A. Irvine
 */
public class A001271 extends A001269 {

  @Override
  protected Z base() {
    return Z.TEN;
  }
}
