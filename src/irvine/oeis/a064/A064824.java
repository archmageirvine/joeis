package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a065.A065191;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064824 Same as A065191 but with B_[1]=( i mod 10, i=0,1,2,3..).
 * @author Sean A. Irvine
 */
public class A064824 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064824() {
    super(new A065191(), k -> k.subtract(1).mod(Z.TEN));
  }
}
