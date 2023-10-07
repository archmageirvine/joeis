package irvine.oeis.a066;

import java.util.List;
import java.util.stream.Collectors;

import irvine.math.z.Z;
import irvine.oeis.a000.A000162;
import irvine.oeis.a001.A001931;

/**
 * A000162 Number of 3-dimensional polyominoes (or polycubes) with n cells.
 * @author Sean A. Irvine
 */
public class A066273 extends A000162 {

  @Override
  public Z next() {
    super.next();
    long cnt = 0;
    for (final List<Point> poly : mPrev) {
      final long sym = generateSymmetries(poly).stream()
        .map(A001931::translateToOrigin)
        .map(lst -> lst.stream().sorted(BY_COORDS).collect(Collectors.toList()))
        .distinct()
        .count();
      if (sym == 8) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
