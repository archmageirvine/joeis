package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076676 Smallest a(n)&gt;a(n-1) such that a(n)^2+a(n-1)^2 is a perfect square, a(1)=11.
 * @author Sean A. Irvine
 */
public class A076676 extends A076671 {

  /** Construct the sequence. */
  public A076676() {
    super(Z.valueOf(11));
  }
}
