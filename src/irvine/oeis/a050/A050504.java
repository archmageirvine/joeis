package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050504 Integer part of n*log(n).
 * @author Sean A. Irvine
 */
public class A050504 extends AbstractSequence {

  /* Construct the sequence. */
  public A050504() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(n.log()).floor();
  }
}
