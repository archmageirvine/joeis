package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000123;

/**
 * A022907 The sequence m(n) in A022905.
 * @author Sean A. Irvine
 */
public class A022907 extends A000123 {

  /** Construct the sequence. */
  public A022907() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().multiply(3).divide2().subtract(1);
  }
}
