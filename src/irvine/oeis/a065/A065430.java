package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A065430 Order of commutator subgroup of GL(2,Z_n) (invertible 2 X 2 matrices mod n: A000252).
 * @author Sean A. Irvine
 */
public class A065430 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A065430() {
    super(1, (p, e) -> Z.TWO.equals(p) ? Z.THREE.shiftLeft(3L * e - 3) : p.square().subtract(1).multiply(p.pow(3L * e - 2)));
  }
}

