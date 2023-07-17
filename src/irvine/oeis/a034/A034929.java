package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a091.A091836;

/**
 * A034929 A triangle of Motzkin ballot numbers, read by rows.
 * @author Sean A. Irvine
 */
public class A034929 extends A091836 {

  /** Construct the sequence. */
  public A034929() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return t(mN, mM);
  }
}

