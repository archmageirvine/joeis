package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.a028.A028666;

/**
 * A144547 A bisection of A028666.
 * @author Georg Fischer
 */
public class A144547 extends A028666 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
