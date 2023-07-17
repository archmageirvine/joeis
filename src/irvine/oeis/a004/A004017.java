package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a007.A007331;

/**
 * A004017 Theta series of E_8 lattice with respect to deep hole.
 * @author Sean A. Irvine
 */
public class A004017 extends A007331 {

  /** Construct the sequence. */
  public A004017() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(4);
  }
}
