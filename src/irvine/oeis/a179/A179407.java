package irvine.oeis.a179;

import java.util.Map;

import irvine.math.z.Z;

/**
 * A179407 Values x for records of minima of positive distance d between a fifth power of positive integer x and a square of integer y such d = x^5 - y^2 (x != k^2 and y != k^5).
 * @author Sean A. Irvine
 */
public class A179407 extends A179406 {

  @Override
  protected Z select(final Map.Entry<Z, Long> e) {
    return Z.valueOf(e.getValue());
  }
}

