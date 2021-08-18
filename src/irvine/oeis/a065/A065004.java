package irvine.oeis.a065;
// manually 2021-05-14 

import irvine.math.z.Z;
import irvine.oeis.a095.A095425;

/**
 * A065004 100 written in base n, or -1 if the representation requires digits outside of 0 to 9.
 * @author Georg Fischer
 */
public class A065004 extends A095425 {

  /** Construct the sequence. */
  public A065004() {
    super(100);
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return result == null ? Z.NEG_ONE : result;
  }
}
