package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000010;

/**
 * A023022.
 * @author Sean A. Irvine
 */
public class A023022 extends PrependSequence {

  /** Construct the sequence. */
  public A023022() {
    super(new SkipSequence(new A000010() {
      @Override
      public Z next() {
        return super.next().divide2();
      }
    }, 2), 1);
  }
}
