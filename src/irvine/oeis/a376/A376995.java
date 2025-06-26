package irvine.oeis.a376;
// manually 2025-06-23/ratos 

import irvine.math.z.Z;
import irvine.oeis.recur.RationalRecurrence;

/**
 * A376995 a(n) = floor(b(n)), where b(1) = 1 and b(n) = b(n-1) + Sum_{k=1..n-1} b(k)/(n-1).
 * @author Georg Fischer
 */
public class A376995 extends RationalRecurrence {

  /** Construct the sequence. */
  public A376995() {
    super(1, "[[0],[2,-1],[-2,2],[1,-1]]", "1,2", 0, 0);
  }

  @Override
  public Z next() {
    return nextQ().floor();
  }
}
