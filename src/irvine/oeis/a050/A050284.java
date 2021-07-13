package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a035.A035117;

/**
 * A050284 a(n) is the starting position of the first occurrence of a string of (at least) n '5's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A050284 extends A035117 {

  @Override
  protected Z digit() {
    return Z.FIVE;
  }
}

