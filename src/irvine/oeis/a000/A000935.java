package irvine.oeis.a000;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A000935 Number of free planar polyenoids with <code>2n</code> nodes and symmetry point group <code>C_{2h}</code>.
 * @author Sean A. Irvine
 */
public class A000935 extends A000942 {

  private Set<Point> reflectVertical(final Set<Point> embedding) {
    final Set<Point> res = new HashSet<>(embedding.size());
    for (final Point pt : embedding) {
      res.add(new Point(pt.left(), -pt.right()));
    }
    return res;
  }

  @Override
  protected boolean accept(final Set<Point> normal) {
    // Check for C_{2h} symmetry
    int v = 0;
    final Set<Point> h = normalize(reflect(normalize(reflectVertical(normal))));
    if (!normal.equals(h)) {
      return false;
    }
    // But we may have too much symmetry ..., so more testing is needed
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
    return v == 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next();
  }
}

