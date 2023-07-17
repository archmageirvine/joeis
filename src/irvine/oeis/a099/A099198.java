package irvine.oeis.a099;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a002.A002807;

/**
 * A099198 A bisection of A002807.
 * @author Georg Fischer
 */
public class A099198 extends A002807 {

  /** Construct the sequence. */
  public A099198() {
    super(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
