package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.math.z.Z;
import irvine.oeis.a006.A006746;
import irvine.oeis.a006.A006747;
import irvine.oeis.a006.A006748;
import irvine.oeis.a006.A006749;
import irvine.oeis.a056.A056877;
import irvine.oeis.a056.A056878;
import irvine.oeis.a142.A142886;
import irvine.oeis.a144.A144553;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A182645 Number of poly-IH68-tiles (holes allowed) with n cells.
 * @author Georg Fischer
 */
public class A182645 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A182645() {
    super(1, (self, n) -> Z.FOUR.multiply(self.s(0)).add(Z.TWO.multiply(self.s(1))).add(Z.THREE.multiply(self.s(2))).add(Z.TWO.multiply(self.s(3))).add(self.s(4)).add(Z.TWO.multiply(self.s(5))).add(self.s(6)).add(self.s(7)), "", new A006749(), new A006746(), new A006748(), new A006747(), new A056877(), new A056878(), new A144553(), new A142886());
  }
}
