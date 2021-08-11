package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050256 A Diaconis-Mosteller approximation to the Birthday problem function.
 * @author Sean A. Irvine
 */
public class A050256 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(new Q(2 * ++mN - 3, 2).pow(3)).sqrt().multiply(47).floor();
  }
}

