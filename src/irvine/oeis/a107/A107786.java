package irvine.oeis.a107;
// manually rectoproc/holos at 2022-07-14 16:07

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A107786 a(n) = |b(n)| where b(n) = -b(n-1) + 6*b(n-3) with b(0)=0, b(1)=1, b(2)=1.
 * @author Georg Fischer
 */
public class A107786 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107786() {
    super(0, "[[0],[6],[0],[-1],[-1]]", "[0, 1, 1]", 0);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
