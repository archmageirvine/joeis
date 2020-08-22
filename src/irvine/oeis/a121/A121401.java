package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121401 a(n)=((sqrt(3)+1)^n+(sqrt(3)-1)^n)^2/2^(n+1).
 * @author Sean A. Irvine
 */
public class A121401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121401() {
    super(new long[] {1, -5, 5}, new long[] {2, 3, 8});
  }
}
