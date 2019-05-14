package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276403 <code>a(n) =</code> if <code>n mod 6 = 0</code> then <code>4*3^((n-6)/3) elif n mod 6 = 1</code> then <code>2^4*3^((n-10)/3) elif n mod 6 = 2</code> then <code>2^3*3^((n-8)/3) elif n mod 6 = 3</code> then <code>2^2*3^((n-6)/3) elif n mod 6 = 4</code> then <code>2*3^((n-4)/3)</code> otherwise <code>3^((n-2)/3)</code>.
 * @author Sean A. Irvine
 */
public class A276403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276403() {
    super(new long[] {9, 0, 0, 0, 0, 0}, new long[] {8, 12, 18, 27, 36, 48});
  }
}
