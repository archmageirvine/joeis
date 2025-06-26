package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385122;

/**
 * A078151 Smallest k such that d(phi(k)) - phi(d(k)) = -n, where d(k) = A000005(k) and phi(k) = A000010(k).
 * @author Sean A. Irvine
 */
public class A078151 extends InverseSequence {

  /** Construct the sequence. */
  public A078151() {
    super(1, new A385122() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    });
  }
}
