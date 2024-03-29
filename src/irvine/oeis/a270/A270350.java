package irvine.oeis.a270;
// Generated by gen_seq4.pl regypt/parmof3 at 2024-01-20 11:51

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a269.A269993;

/**
 * A270350 Denominators of r-Egyptian fraction expansion for sqrt(3) - 1, where r = (1, 1/2, 1/4, 1/8, ...).
 * @author Georg Fischer
 */
public class A270350 extends A269993 {

  /** Construct the sequence. */
  public A270350() {
    super(1, CR.THREE.sqrt().subtract(1L), k -> Z.TWO.pow(k - 1));
  }
}
