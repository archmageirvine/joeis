package irvine.oeis.a219;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A219555 Number of bipartite partitions of (i,j) with i+j = n into distinct pairs.
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^(k+1))</code>
 * @author Georg Fischer
 */
public class A219555 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A219555() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(-(k + 1))};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
