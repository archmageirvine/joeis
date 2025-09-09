package irvine.oeis.a384;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A384724 a(n) is the number of 4 element sets of distinct integer sided strict rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A384724 extends A385240 {

  private int mN = 0;

  @Override
  protected List<Rectangle> buildRectangles(final int n) {
    final List<Rectangle> rectangles = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x + 1; y <= n; ++y) {
        rectangles.add(new Rectangle(x, y));
      }
    }
    Collections.sort(rectangles);
    return rectangles;
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

