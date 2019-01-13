package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a001.A001644;

/**
 * A004306.
 * @author Sean A. Irvine
 */
public class A004306 extends A001644 {

  private static final Z[] INITIAL_TERMS = {Z.ONE, Z.ONE, Z.TWO, Z.SIX};
  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    return ++mN < INITIAL_TERMS.length ? INITIAL_TERMS[mN] : t.add(1).multiply2();
  }
}

