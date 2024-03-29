package irvine.oeis.a246;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;

/**
 * A246618 Number of endofunctions on [2n] whose cycle lengths are multiples of n.
 * @author Georg Fischer
 */
public class A246618 extends A246609 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(2 * mN, mN);
  }
}

