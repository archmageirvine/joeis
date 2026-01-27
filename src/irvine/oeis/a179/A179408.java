package irvine.oeis.a179;

import java.util.Map;

import irvine.math.z.Z;

/**
 * A179408 Values y for records of minima of positive distance d between a fifth power of a positive integer x and a square of an integer y such d = x^5 - y^2 (x != k^2 and y != k^5).
 * @author Sean A. Irvine
 */
public class A179408 extends A179406 {

  @Override
  protected Z select(final Map.Entry<Z, Long> e) {
    return Z.valueOf(e.getValue()).pow(5).sqrt();
  }
}

