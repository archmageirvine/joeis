package irvine.oeis.a000;

import java.util.HashSet;
import java.util.Set;

import irvine.util.Point;

/**
 * A000936 Number of free planar polyenoids with n nodes and symmetry point group C_{2v}.
 * @author Sean A. Irvine
 */
public class A000936 extends A000942 {

  private Set<Point> reflectVertical(final Set<Point> embedding) {
    final Set<Point> res = new HashSet<>(embedding.size());
    for (final Point pt : embedding) {
      res.add(new Point(pt.left(), -pt.right()));
    }
    return res;
  }

  @Override
  protected boolean accept(final Set<Point> normal) {
    // Check for C_{2v} symmetry
    int v = 0;
    Set<Point> transform = normal;
    for (int k = 0; k < 3; ++k) {
      if (transform.equals(normalize(reflect(transform)))) {
        ++v;
      }
      transform = normalize(rotate60(transform));
    }
    if ((mN & 1) == 0) {
      transform = normal;
      for (int k = 0; k < 3; ++k) {
        if (transform.equals(normalize(reflectVertical(transform)))) {
          ++v;
        }
        transform = normalize(rotate60(transform));
      }
    }
    return v == 1;
  }
}

