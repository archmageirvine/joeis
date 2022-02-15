package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010120;

/**
 * A054646.
 * @author Sean A. Irvine
 */
public class A054646 extends PrependSequence {

  /** Construct the sequence. */
  public A054646() {
    super(new SkipSequence(new A010120() {
      @Override
      public Z next() {
        super.next();
        return super.next();
      }
    }, 1), 1);
  }

}
