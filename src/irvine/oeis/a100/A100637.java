package irvine.oeis.a100;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A100637 Trisection of A000720.
 * @author Georg Fischer
 */
public class A100637 extends A000720 {

  /** Construct the sequence. */
  public A100637() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
