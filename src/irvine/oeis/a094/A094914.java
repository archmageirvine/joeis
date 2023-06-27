package irvine.oeis.a094;
// 2019-04-11, Georg Fischer: abs() inserted

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A094914 Absolute value of n^2 + n - 1354363.
 * @author Sean A. Irvine
 */
public class A094914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094914() {
    super(1, new long[] {1, -3, 3}, new long[] {1354361, 1354357, 1354351});
  }
  
  @Override
  public Z next() {
    return super.next().abs();
  }
}
