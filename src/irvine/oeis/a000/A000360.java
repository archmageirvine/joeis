package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000360 Distribution of nonempty triangles inside a fractal rep-4-tile.
 * @author Sean A. Irvine
 */
public class A000360 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    final int h = ++mN / 2;
    final Z t;
    if (mN == 0) {
      t = Z.ONE;
    } else if ((mN & 1) == 0) {
      t = mA.get(h).add(mA.get(h - 1));
    } else {
      t = mA.get(h).add(1 - (h + 2) % 3);
    }
    mA.add(t);
    return t;
  }
}
