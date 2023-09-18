package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A065888 a(n) = number of endofunctions on [n] with a 4-cycle a-&gt;b-&gt;c-&gt;d-&gt;a and for any x in [n], some iterate f^k(x) = a.
 * @author Sean A. Irvine
 */
public class A065888 extends AbstractSequence {

  private long mN = 3;

  /** Construct the sequence. */
  public A065888() {
    super(4);
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 4).multiply(mN - 3).multiply(mN - 2).multiply(mN - 1);
  }
}
