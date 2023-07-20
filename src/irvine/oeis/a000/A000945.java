package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.prime.EuclidMullinSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A000945 Euclid-Mullin sequence: a(1) = 2, a(n+1) is smallest prime factor of 1 + Product_{k=1..n} a(k).
 * @author Sean A. Irvine
 */
public class A000945 extends Sequence1 {

  private final Sequence mSeq;

  /** Construct the sequence */
  public A000945() {
    this(2);
  }
  
  /** 
   * Generic constructor with parameter
   * @param parm initial term
   */
  public A000945(final long parm) {
    mSeq = EuclidMullinSequence.create(parm);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
