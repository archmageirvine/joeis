package irvine.oeis.a230;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.AlonsoSequence;

/**
 * A230627 Prime reached in A230626, or -1 if no prime is reached.
 * @author Sean A. Irvine
 */
public class A230627 extends AbstractSequence {

  /** Construct the sequence. */
  public A230627() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    final AlonsoSequence seq = new AlonsoSequence(++mN, 2);
    Z u = null;
    Z t;
    while ((t = seq.next()) != null) {
      u = t;
    }
    if (u == null) {
      throw new RuntimeException();
    }
    return u.isProbablePrime(32) ? u : Z.NEG_ONE;
  }
}
