package irvine.oeis.a072;
// manually parm3 at 2021-08-30 21:23

import irvine.math.z.Z;
import irvine.oeis.a094.A094969;

/**
 * A072418 Parity of floor(3^n/2^n).
 * @author Georg Fischer
 */
public class A072418 extends A094969 {

  /** Construct the sequence. */
  public A072418() {
    super(1, 3, 2);
  }
  
  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
