package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002546 Denominator of Sum_{i+j+k=n; i,j,k &gt; 0} 1/(i*j*k).
 * @author Sean A. Irvine
 */
public class A002546 extends A002545 {

  /** Construct the sequence. */
  public A002546() {
    super(1);
  }

  @Override
  public Z next() {
    return step().den();
  }
}
