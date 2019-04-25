package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a011.A011260;

/**
 * A000020 Number of primitive polynomials of degree n over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public class A000020 implements Sequence {

  private Sequence mSeq = null;

  @Override
  public Z next() {
    if (mSeq == null) {
      mSeq = new A011260();
      mSeq.next();
      return Z.TWO;
    }
    return mSeq.next();
  }
}

