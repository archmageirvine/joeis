package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A054886 Layer counting sequence for hyperbolic tessellation by cuspidal triangles of angles (Pi/3,Pi/3,0) (this is the classical modular tessellation).
 * @author Sean A. Irvine
 */
public class A054886 extends PrependSequence {

  /** Construct the sequence. */
  public A054886() {
    super(new SkipSequence(new A000045(), 4) {
      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }, 1, 3);
  }
}
