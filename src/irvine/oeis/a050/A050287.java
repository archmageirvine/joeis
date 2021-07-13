package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a035.A035117;

/**
 * A050287 Starting position of the first occurrence of a string of at least n '8's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A050287 extends A035117 {

  @Override
  protected Z digit() {
    return Z.EIGHT;
  }
}

