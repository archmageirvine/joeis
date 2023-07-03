package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A046813 Smallest number m with nonzero digits such that A046810(m)=n.
 * @author Sean A. Irvine
 */
public class A046813 extends InverseSequence {

  /** Construct the sequence. */
  public A046813() {
    super(0, new A046810() {
      @Override
      public Z next() {
        // Contortions to deal with excluding indices containing 0
        final Z t = super.next();
        return String.valueOf(mN).contains("0") ? Z.ZERO : t;
      }
    }, 0);
  }
}
