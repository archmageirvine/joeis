package irvine.oeis.a000;

import java.util.Set;

import irvine.util.Point;

/**
 * A000941 Number of free planar polyenoids with n nodes and symmetry point group C_s.
 * @author Sean A. Irvine
 */
public class A000941 extends A000942 {

  @Override
  protected boolean accept(final Set<Point> normal) {
    // Check for C_s symmetry
    Set<Point> transform = normal;
    for (int k = 1; k < 6; ++k) {
      transform = normalize(rotate60(transform));
      if (transform.equals(normal)) {
        return false;
      }
    }
    transform = normalize(reflect(normal));
    if (transform.equals(normal)) {
      return false;
    }
    for (int k = 1; k < 6; ++k) {
      transform = normalize(rotate60(transform));
      if (transform.equals(normal)) {
        return false;
      }
    }
    return true;
  }
}

