package irvine.oeis.a269;
// Generated by gen_seq4.pl dersimpln at 2021-09-02 16:26

import irvine.math.z.Z;

/**
 * A269024 a(n) = A269020(n) - n.
 * @author Georg Fischer
 */
public class A269024 extends A269020 {

  protected int mN;
  
  /** Construct the sequence */
  public A269024() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mN);
  }
}
