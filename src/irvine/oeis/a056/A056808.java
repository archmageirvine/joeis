package irvine.oeis.a056;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a055.A055932;

/**
 * A056808 Members of A055932 which are not least prime signatures (cf. A025487).
 * @author Sean A. Irvine
 */
public class A056808 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A056808() {
    super(new A055932(), new A025487());
  }
}
