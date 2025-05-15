package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A383646 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A383646 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A383646() {
    super(0, NONCOMPUTABLE, Z.ONE, Z.TEN, Z.valueOf(112), Z.valueOf(1189), Z.valueOf(778), Z.valueOf(13477), new Z("2388889999999999999999"));
    // Next term is too large to represent
  }
}
