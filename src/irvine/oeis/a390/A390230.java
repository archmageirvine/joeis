package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390230 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A390230 extends Sequence0 {

  // ChatGPT assisted conversion of Frank M Jackson's Mathematica

  private final List<Z[]> mNodes = new ArrayList<>();
  private int mPos = 0;
  private int mLevel = 0;

  /** Construct the sequence. */
  public A390230() {
    // initial seed {2,1}
    mNodes.add(new Z[]{Z.TWO, Z.ONE});
  }

  private static Z[] m1(final Z[] v) {
    return new Z[]{
      v[0].multiply2().subtract(v[1]),
      v[0]
    };
  }

  private static Z[] m2(final Z[] v) {
    return new Z[]{
      v[0].multiply2().add(v[1]),
      v[0]
    };
  }

  private static Z[] m3(final Z[] v) {
    return new Z[]{
      v[0].add(v[1].multiply2()),
      v[1]
    };
  }

  private void expandLevel() {
    final int start = (Z.THREE.pow(mLevel).subtract(Z.ONE)).divide2().intValueExact();
    final int end = mNodes.size();
    for (int i = start; i < end; ++i) {
      final Z[] v = mNodes.get(i);
      mNodes.add(m1(v));
      mNodes.add(m2(v));
      mNodes.add(m3(v));
    }
    ++mLevel;
  }

  @Override
  public Z next() {
    if (mPos >= mNodes.size()) {
      expandLevel();
    }
    final Z[] v = mNodes.get(mPos++);
    // x^2 + y^2 + x*y
    return v[0].square().add(v[1].square()).add(v[0].multiply(v[1]));
  }
}
