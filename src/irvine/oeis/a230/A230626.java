package irvine.oeis.a230;

import irvine.math.z.Z;
import irvine.oeis.AlonsoSequence;
import irvine.oeis.Sequence;

/**
 * A230626.
 * @author Sean A. Irvine
 */
public class A230626 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    long  c = -1;
    final AlonsoSequence seq = new AlonsoSequence(++mN, 2);
    Z u = null;
    Z t;
    while ((t = seq.next()) != null) {
      ++c;
      u = t;
    }
    if (u == null) {
      throw new RuntimeException();
    }
    return u.isProbablePrime(32) ? Z.valueOf(c) : Z.NEG_ONE;
  }
}
