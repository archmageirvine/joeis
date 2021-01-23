package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.EuclidMullinSequence;
import irvine.oeis.Sequence;

/**
 * A000945 Euclid-Mullin sequence: a(1) = 2, a(n+1) is smallest prime factor of 1 + Product_{k=1..n} a(k).
 * @author Sean A. Irvine
 */
public class A000945 implements Sequence {

  private final Sequence mSeq = EuclidMullinSequence.create(2);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
