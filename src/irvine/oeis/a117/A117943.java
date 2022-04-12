package irvine.oeis.a117;
// manually A126616/parm2 at 2022-04-12 09:39

import irvine.math.z.Z;
import irvine.oeis.a126.A126616;

/**
 * A117943 a(1) = 0, a(2) = 1; a(3n) = a(n); if every third term (a(3), a(6), a(9), ...) is deleted, this gives back the original sequence.
 * @author Georg Fischer
 */
public class A117943 extends A126616 {

  /** Construct the sequence. */
  public A117943() {
    super(3);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
