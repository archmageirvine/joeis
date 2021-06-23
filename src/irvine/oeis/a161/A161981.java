package irvine.oeis.a161;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a006.A006128;

/**
 * A161981 A006128(n) mod n.
 * @author Georg Fischer
 */
public class A161981 extends A006128 {
    
  protected int mN;

  /** Construct the sequence. */
  public A161981() {
    mN = 0;
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(++mN));
  }
}
