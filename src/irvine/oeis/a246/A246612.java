package irvine.oeis.a246;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;

/**
 * A246612 Number of endofunctions on [n] whose cycle lengths are multiples of 5.
 * @author Georg Fischer
 */
public class A246612 extends A246609 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(mN, 5);
  }
}

