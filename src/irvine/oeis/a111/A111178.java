package irvine.oeis.a111;
// Generated by gen_seq4.pl genetgh at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A111178 Number of partitions of n into positive numbers one less than a square.
 * G.f.: <code>Product_{k&gt;=2} (1/(1-x^(k*k-1)))</code>
 * @author Georg Fischer
 */
public class A111178 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A111178() {
    super(0, 2);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z advanceG(final long k) {
    return (mKfg < 2) ? Z.ZERO : Z.ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * k - 1);
  }

}
