package irvine.oeis.a212;
// Generated by gen_seq4.pl A212551/treonk

import irvine.math.z.Z;

/**
 * A212545 Number of partitions of n containing at least one part m-5 if m is the largest part.
 * @author Georg Fischer
 */
public class A212545 extends A212551 {

  private int mN = 4;

  {
    setOffset(5);
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 5);
  }
}

