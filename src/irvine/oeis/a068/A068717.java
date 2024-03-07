package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a049.A049240;
import irvine.oeis.a067.A067280;

/**
 * A068717 a(n) = -1 if A067280(n) == 0 (mod 2), otherwise a(n) = A049240(n).
 * @author Sean A. Irvine
 */
public class A068717 extends Combiner {

  /** Construct the sequence. */
  public A068717() {
    super(1, new A067280(), new A049240(), (a, b) -> a.isEven() ? Z.NEG_ONE : b);
  }
}
