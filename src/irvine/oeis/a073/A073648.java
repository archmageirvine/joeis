package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a022.A022004;

/**
 * A073648 Middle members of prime triples {p, p+2, p+6}.
 * @author Georg Fischer
 */
public class A073648 extends Sequence1 {

  private final Sequence mA022004 = new A022004();

  @Override
  public Z next() {
    return mA022004.next().add(2);
  }
}
