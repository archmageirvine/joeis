package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275546 a(n) = (tan(1*Pi/11))^(2*n)+(tan(2*Pi/11))^(2*n)+(tan(3*Pi/11))^(2*n)+(tan(4*Pi/11))^(2*n)+(tan(5*Pi/11))^(2*n).
 * @author Sean A. Irvine
 */
public class A275546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275546() {
    super(new long[] {11, -165, 462, -330, 55}, new long[] {5, 55, 2365, 113311, 5476405});
  }
}
