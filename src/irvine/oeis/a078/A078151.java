package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385122;

/**
 * A078151 Smallest x such that d[phi(x)]-phi[d(x)]=-n, where d()=A000005(),phi()=A000010(); restricted to cases when d[phi(x)]-phi[d(x)] is negative.
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
