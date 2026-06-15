package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395643 Numbers k whose largest prime factor exceeds k^(2/3).
 * @author Sean A. Irvine
 */
public class A395643 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395643() {
    super(1, k -> Functions.GPF.z(k).compareTo(Z.valueOf(k).square().root(3)) > 0);
  }
}
