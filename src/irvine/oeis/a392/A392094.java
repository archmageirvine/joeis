package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A392094 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392094 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A392093());
  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    Z t = Z.valueOf(++mN);
    while (!t.isOne()) {
      t = mA.a(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
