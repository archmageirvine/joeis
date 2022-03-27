package irvine.oeis.a173;
// manually A098640/parm2 at 2022-03-26 21:29

import irvine.math.z.Z;
import irvine.oeis.a060.A060205;

/**
 * A173064 a(n) = prime(n) - 5.
 * @author Georg Fischer
 */
public class A173064 extends A060205 {

  {
    super.next();
    super.next();
  }

  /** Construct the sequence. */
  public A173064() {
    super(p -> Z.valueOf(p).add(-5));
  }
}
