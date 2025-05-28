package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a052.A052182;
import irvine.oeis.a085.A085719;

/**
 * A383775 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383775 extends Combiner {

  /** Construct the sequence. */
  public A383775() {
    super(1, new A052182() {

      private int mN = -1;

      @Override
      public Z next() {
        return super.next().multiply(Z.NEG_ONE.pow(++mN / 2));
      }
    }, new A085719().skip(), (det, perm) -> det.add(perm).divide2());
  }
}
