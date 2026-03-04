package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A079703 Numbers 4p where p is prime and 2p+1 and 4p+1 are composite.
 * @author Sean A. Irvine
 */
public class A079703 extends AbstractSequence {

  private final A000040 mSeq = new A000040();

  /** Construct the sequence. */
  public A079703() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
      if (!p.multiply2().add(1).isProbablePrime()) {
        final Z p4 = p.multiply(4);
        if (!p4.add(1).isProbablePrime()) {
          return p4;
        }
      }
    }
  }
}

