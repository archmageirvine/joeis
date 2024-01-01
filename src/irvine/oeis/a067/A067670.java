package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A067670 Smallest prime of additive persistence n.
 * @author Sean A. Irvine
 */
public class A067670 extends NoncomputableSequence {

  public A067670() {
    super(0, NONCOMPUTABLE, Z.TWO, Z.valueOf(11), Z.valueOf(19), Z.valueOf(199), new Z("29998999999999999999999"));
  }
}
