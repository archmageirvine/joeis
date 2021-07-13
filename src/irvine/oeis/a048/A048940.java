package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a035.A035117;

/**
 * A048940 Starting position of the first occurrence of a string of at least n '9's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A048940 extends A035117 {

  @Override
  protected Z digit() {
    return Z.NINE;
  }
}

