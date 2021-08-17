package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a046.A046460;

/**
 * A050676 Let b(n) = number of prime factors (with multiplicity) of concatenation of numbers from 1 to n; sequence gives smallest number m with b(m) = n.
 * @author Sean A. Irvine
 */
public class A050676 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050676() {
    super(new A046460() {
      @Override
      public Z next() {
        return super.next().max(Z.ONE);
      }
    });
  }
}
