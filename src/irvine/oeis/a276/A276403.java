package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276403 a(n) = if n mod 6 = 0 then 4*3^((n-6)/3) elif n mod 6 = 1 then 2^4*3^((n-10)/3) elif n mod 6 = 2 then 2^3*3^((n-8)/3) elif n mod 6 = 3 then 2^2*3^((n-6)/3) elif n mod 6 = 4 then 2*3^((n-4)/3) otherwise 3^((n-2)/3).
 * @author Sean A. Irvine
 */
public class A276403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276403() {
    super(new long[] {9, 0, 0, 0, 0, 0}, new long[] {8, 12, 18, 27, 36, 48});
  }
}
