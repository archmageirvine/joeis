package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A345117 allocated for Josip Ivica.
 * @author Sean A. Irvine
 */
public class A345117 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final boolean[] seen = new boolean[mN];
    int pos = 0;
    int stride = 0;
    while (!seen[pos]) {
      seen[pos] = true;
      pos += ++stride;
      pos %= mN;
    }
    return Z.valueOf(pos);
  }
}
