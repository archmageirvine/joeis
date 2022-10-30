package irvine.oeis.a056;
// manually A098640/parm2 at 2022-03-26 17:40

import irvine.math.z.Z;
import irvine.oeis.a060.A060205;

/**
 * A056852 (p^p + 1)/(p + 1) where p is prime.
 * @author Georg Fischer
 */
public class A056852 extends A060205 {

  {
    setOffset(2);
    super.next(); // skip prime(1)=2
  }

  /** Construct the sequence. */
  public A056852() {
    super(p -> Z.valueOf(p).pow(p).add(1).divide(p + 1));
  }
}
