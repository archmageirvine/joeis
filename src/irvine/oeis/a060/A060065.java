package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060065 Smallest mode of the sequence { C(n-k,k), k=0..n/2 }.
 * @author Sean A. Irvine
 */
public class A060065 extends AbstractSequence {

  /* Construct the sequence. */
  public A060065() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(5 * ++mN + 6).subtract(Z.valueOf(5 * mN).add(10).multiply(mN).add(9).sqrt()).divide(10);
  }
}
