package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075680;
import irvine.oeis.a166.A166549;

/**
 * A392777 allocated for V. Barbera.
 * @author Sean A. Irvine
 */
public class A392777 extends Sequence1 {

  private final Sequence mA = new A166549();
  private final Sequence mB = new A075680();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.TWO.pow(mA.next()).subtract(Z.THREE.pow(mB.next()).multiply(2 * ++mN - 1));
  }
}

