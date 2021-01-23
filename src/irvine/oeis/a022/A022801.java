package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a090.A090946;

/**
 * A022801 n-th Lucas number (A000204(n)) + n-th non-Lucas number (A090946(n+1)).
 * @author Sean A. Irvine
 */
public class A022801 implements Sequence {

  private final Sequence mA = new A000204();
  private final Sequence mB = new SkipSequence(new A090946(), 1);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
