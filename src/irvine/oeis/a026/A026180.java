package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026180 a(n) = s(k), where k is the n-th number such that s(j)&lt;s(k) for all j&lt;k, where s = A026177.
 * @author Sean A. Irvine
 */
public class A026180 extends RecordSequence {

  /** Construct the sequence. */
  public A026180() {
    super(new A026177());
  }
}
