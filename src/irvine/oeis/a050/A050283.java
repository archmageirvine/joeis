package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a035.A035117;

/**
 * A050283 a(n) is the starting position of the first occurrence of a string of n 4's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A050283 extends A035117 {

  @Override
  protected Z digit() {
    return Z.FOUR;
  }
}

