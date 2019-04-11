package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027804 <code>a(n) =</code> 14*(n+1)*C(n+4,8).
 * @author Sean A. Irvine
 */
public class A027804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027804() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {70, 756, 4410, 18480, 62370, 180180, 462462, 1081080, 2342340, 4764760});
  }
}
